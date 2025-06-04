# OAuth2 로그인 구현 학습

## 1. OAuth2 인증 흐름
![OAuth2 Flow](https://your-image-url.com/oauth2-flow.png)

### 1.1 기본 흐름
1. 사용자가 카카오 로그인 버튼 클릭
2. 카카오 로그인 페이지로 리다이렉트
3. 사용자 카카오 로그인 수행
4. 인증 코드를 백엔드로 전달
5. 백엔드에서 액세스 토큰 교환
6. 사용자 정보 조회 및 처리
7. 인증 완료 및 서비스 이용

### 1.2 주요 컴포넌트
- `OAuth2Service`: 카카오 사용자 정보 처리
- `SecurityConfig`: OAuth2 보안 설정
- `PrincipalDetails`: 인증된 사용자 정보 관리
- `KakaoUserInfo`: 카카오 사용자 정보 매핑

## 2. 설정 방법

### 2.1 application.yml 설정
```yaml
spring:
  security:
    oauth2:
      client:
        registration:
          kakao:
            client-id: ${KAKAO_CLIENT_ID}
            client-secret: ${KAKAO_CLIENT_SECRET}
            redirect-uri: "{baseUrl}/login/oauth2/code/kakao"
            authorization-grant-type: authorization_code
            client-authentication-method: client_secret_post
            scope:
              - profile_nickname
              - profile_image
              - account_email
        provider:
          kakao:
            authorization-uri: https://kauth.kakao.com/oauth/authorize
            token-uri: https://kauth.kakao.com/oauth/token
            user-info-uri: https://kapi.kakao.com/v2/user/me
            user-name-attribute: id
```

### 2.2 필요한 의존성
```gradle
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-oauth2-client'
    implementation 'org.springframework.boot:spring-boot-starter-security'
    // ... 기타 필요한 의존성
}
```

### 2.3 엔드 포인트 동작 방식
'''
엔드포인트들은 다음과 같이 지정

로그인 엔드포인트
(예: /oauth2/authorization/my-oidc-client)는 로그인을 시작하고 타사 인증 서버로 리디렉션을 수행하는 데 사용됩니다.
-> Spring Security와 OAuth2 클라이언트 라이브러리는 해당 엔드포인트를 통해 OAuth2, OIDC 인증 플로우 시작
-> 해당 Get /oauth2/authorization/{my-oidc-client} 엔드포인트로 리디렉션, 이때 my-oidc-client는 OAuth2 클라이언트 등록 이름

리디렉션 엔드포인트
(예: /login/oauth2/code/my-oidc-client)는 권한 부여 서버가 클라이언트 애플리케이션으로 다시 리디렉션하는 데 사용되며 액세스 토큰 요청을 통해 and/or를 code얻는 데 사용되는 매개변수를 포함합니다.id_tokenaccess_token
-> 사용자가 인증 서버에서 로그인을 완료하면 카카오 서버는 클라이언트 애플리케이션의 리디렉션 엔드포인트로 돌아감
-> 이때 인가코드를 포함한 리디렉션 url을 클라이언트에 전달
-> 클라이언트는 해당 url로 리디렉션 요청
-> 해당 요청은 액세스 토큰 요청을 포함하며, 이 요청은 인증 서버에서 인증 코드를 교환하고 액세스 토큰을 발급하는 데 사용

'''

### 2.4 상세 흐름
'''
1️⃣ OAuth2 인증 서버와의 상호작용
클라이언트(프론트엔드) → 백엔드 (/oauth2/authorization/kakao) 요청

Spring Security가 OAuth2 인증 서버(Kakao)로 사용자를 리디렉트
사용자 로그인 (Kakao에서 진행됨)

사용자가 Kakao 로그인 완료 → 인가 코드(Authorization Code) 발급
Kakao → 백엔드 (/login/oauth2/code/kakao)

Spring Security가 인가 코드를 이용해 Kakao에서 액세스 토큰 요청
Kakao가 액세스 토큰 + 사용자 정보 반환
OAuth2UserService가 OAuth2User 객체 생성
Spring Security가 OAuth2SuccessHandler 실행

OAuth2User 객체를 기반으로 사용자 처리 진행
'''
## 3. 주요 기능 설명

### 3.1 카카오 로그인
- `/oauth2/authorization/kakao` 엔드포인트로 로그인 시작
- 카카오 인증 후 `/login/oauth2/code/kakao`로 리다이렉트
- `OAuth2Service`에서 사용자 정보 처리

### 3.2 사용자 정보 처리
```java
@Override
public OAuth2User loadUser(OAuth2UserRequest userRequest) {
    OAuth2User oAuth2User = super.loadUser(userRequest);
    // 카카오 사용자 정보 처리
    // DB 저장 및 업데이트
    return new PrincipalDetails(user, oAuth2User.getAttributes());
}
```

### 3.3 보안 설정
```java
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http
        .oauth2Login(oauth2 -> oauth2
            .userInfoEndpoint(userInfo -> userInfo
                .userService(oAuth2UserService)
            )
        );
    return http.build();
}
```

## 4. 테스트 방법

1. 카카오 개발자 콘솔에서 애플리케이션 등록
2. 클라이언트 ID와 시크릿 설정
3. Redirect URI 설정
4. 애플리케이션 실행
5. `/loginForm` 페이지에서 카카오 로그인 테스트

## 5. 주의사항

- 클라이언트 ID와 시크릿은 환경변수로 관리
- Redirect URI는 카카오 개발자 콘솔과 일치해야 함
- 필요한 scope 권한 확인
- 사용자 정보 업데이트 로직 검토

## 6. 향후 개선사항

- [ ] 예외 처리 강화
- [ ] 로그아웃 처리 구현
- [ ] 세션 관리 개선
- [ ] 리프레시 토큰 구현
- [ ] 보안 설정 강화
- [ ] 프론트엔드 연동




## 7. 참고 자료

- [Spring Security OAuth2 문서](https://docs.spring.io/spring-security/reference/servlet/oauth2/index.html)
- [카카오 로그인 문서](https://developers.kakao.com/docs/latest/ko/kakaologin/common)
- [OAuth2 표준 명세](https://oauth.net/2/)