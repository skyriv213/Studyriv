package com.company.ioc;

public class Main {

    public static void main(String[] args) {
	    String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
        /*
        인코딩
        코드화, 암호화를 의미한다.
        사용자가 입력한 문자나 기호들을 컴퓨터가 이용 할 수 있는 신호로 만드는 것을 의미

        Base 64
        8비트 이진 데이터를 문자 코드에 영향을 받지 않는 공통 아스키 영역의
        문자들로만 이루어진 일련의 문자열로 바꾸는 인코딩 방식
        */


        //Base64 encoding
        Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder1 = new Encoder(new UrlEncoder());

        String result =encoder.encode(url);
        String urlResult = encoder1.encode(url);

        System.out.println(result);
        System.out.println(urlResult);



    }
}
