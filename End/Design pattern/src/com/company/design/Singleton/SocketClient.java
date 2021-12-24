package com.company.design.Singleton;

public class SocketClient {

    private static SocketClient socketClient =  null; // 싱글톤은 자기자신을 객체로 가지고 있어야한다.

    private SocketClient(){

    } // 기본생성자를 private를 기본생성자로 막아야함
    public static SocketClient getInstance(){
        if(socketClient ==null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }
/*
    socketClient가 null, 존재하지않을 경우에는 이제 새로운 socketClient 객체를 생성해주고
    만약에 null이 아닐 경우에는 자신이 가지고 있는 socketClient를 호출한다.
 */


    public void connect(){
        System.out.println("connect");
    }
}
