package com.study.stackintelli.config.auth;

import com.study.stackintelli.config.auth.dto.OAuthAttributes;
import com.study.stackintelli.config.auth.dto.SessionUser;
import com.study.stackintelli.domain.user.User;
import com.study.stackintelli.domain.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@RequiredArgsConstructor
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

    private final UserRepository userRepository;
    private final HttpSession httpSession;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2UserService<OAuth2UserRequest, OAuth2User> delegate
                = new DefaultOAuth2UserService();

        OAuth2User oAuth2User
                = delegate.loadUser(userRequest);

        // 현재 로그인 진행 중인 서비스를 구분, 네이버 / 구글 / Etc 의 경우 어떤 로그인인지 구분을 위해 사용
        String registrationId = userRequest
                .getClientRegistration()
                .getRegistrationId();

        // 로그인 진행 시 키가 되는 필드값 의미 = primary key를 의미
        // 구글의 경우 기본적 코드를 제공. 다른 etc들은 기본 지원 x
        // 이후 네이버, 구글의 동시지원의 경우 사용하게 된다.
        String userNameAttributeName = userRequest
                .getClientRegistration()
                .getProviderDetails()
                .getUserInfoEndpoint()
                .getUserNameAttributeName();

        //네이버 등 다른 소셜 로그인의 경우에도 이 클래스를 사용
        OAuthAttributes attributes = OAuthAttributes
                .of(registrationId, userNameAttributeName, oAuth2User.getAttributes());

        User user = saveOrUpdate(attributes);

        // 세션에 사용자 정보를 저장하기 위한 Dto 클래스
        httpSession.setAttribute("user", new SessionUser(user));

        return new DefaultOAuth2User(
                Collections.singleton(
                        new SimpleGrantedAuthority(user.getRoleKey())),
                attributes.getAttributes(),
                attributes.getNameAttributeKey());
    }

    private User saveOrUpdate(OAuthAttributes attributes) {
        User user = userRepository.findByEmail(attributes.getEmail())
                .map(entity -> entity.update(attributes.getName(), attributes.getPicture()))
                .orElse(attributes.toEntity());
        return userRepository.save(user);
    }
}

