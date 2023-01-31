 web socket 
========
web socket 
--

- 기존의 단방향 HTTP 프로토콜과 호환되어 양방향 통신을 제공하기 위해 개발된 프로토콜
- HTTP 80 Port를 사용해서 방화벽에 제약이 없음
- 접속까지는 HTTP 프로토콜을 이용하고, 이후에는 자체적인 WebSocket 프로토콜로 통신
- 클라이언트가 접속 요청을 하고 웹서버가 응답 후 연결을 끊는 것이 아닌 Connection을 그대로 유지하고 클라이언트의 요청없이도 데이터를 전송할 수 있는 프로토콜
- 이 때 요청은 [ws://~] 시작

**********
CORS
---
>교차 출처 리소스 공유 (Cross-Origin Resource Sharing, CORS)   
> - 추가 HTTP 헤더를 사용해 한 출처에서 실행 중인 웹 어플리케이션이 다른 출처의 선택한 자원에 접근할 수 있도록 권한 부여
> - 웹 어플리케이션은 리소스가 자신의 출처와 다를 때 교차 출처 HTTP 요청을 실행
> - EndPoint : HTTP 메서드에 따라 다른 요청을 하는 것을 알 수 있다. API가 서버에서 자원에 접근할 수 있도록 하는 URL
> 
---------
STOMP - Simple Text Oriented Message Protocol
---
> webSocket
