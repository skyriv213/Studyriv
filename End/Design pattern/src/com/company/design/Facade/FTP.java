package com.company.design.Facade;

public class FTP {

    private String host;
    private int port;
    private String path;

    public FTP(String host, int port, String path){
        this.host=host;
        this.path=path;
        this.port=port;
    }
    public void connect(){
        System.out.println("FTP Host : " + host+ "Port : " +port + "로 연결합니다.");
    }
    public void moveDirectory(){
        System.out.println("Path : "+path+"로 이동합니다.");
    }
    public void disConnect(){
        System.out.println("FTP 연결을 종료합니다.");
    }
}
