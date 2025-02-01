package com.example.oauth2.domain.service;


import com.example.oauth2.domain.entity.User;
import com.example.oauth2.domain.oauth2.KakaoUserInfo;
import com.example.oauth2.domain.oauth2.OAuth2UserInfo;
import com.example.oauth2.domain.oauth2.PrincipalDetails;
import com.example.oauth2.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OAuth2Service extends DefaultOAuth2UserService {

    private final PasswordEncoder encoder;

    private final UserRepository userRepository;

    // public OAuth2Service(PasswordEncoder encoder, UserRepository userRepository) {
    //     this.encoder = encoder;
    //     this.userRepository = userRepository;
    // }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        OAuth2UserInfo oAuth2UserInfo = null;
        String registrationId = userRequest.getClientRegistration().getRegistrationId();
        if (registrationId.equals("kakao")) {
            oAuth2UserInfo = new KakaoUserInfo(oAuth2User.getAttributes());
        }else{
            System.out.println("로그인 실패");
        }
        String oauth2Id = getOauth2Id(oAuth2UserInfo);
        Optional<User> findUser = userRepository.findByOauth2Id(oauth2Id);
        User user = null;
        if (findUser.isEmpty()) {
            user = User.builder()
//                    .email(oAuth2UserInfo.getEmail())
                    .role("ROLE_USER")
                    .username(oAuth2UserInfo.getName())
                    .password(encoder.encode("password"))
                    .oauth2Id(oauth2Id)
                    .provider(oAuth2UserInfo.getProvider())
                    .providerId(oAuth2UserInfo.getProviderId())
                    .build();

            userRepository.save(user);
        }else{
           user = findUser.get();
        }

        return new PrincipalDetails(user, oAuth2User.getAttributes());
    }

    private static String getOauth2Id(OAuth2UserInfo oAuth2UserInfo) {
        return oAuth2UserInfo.getProvider() + "_" + oAuth2UserInfo.getProviderId();
    }
}
