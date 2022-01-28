package com.company.ioc;

import java.util.Base64;

public class Encoder implements IEncoder {

    private IEncoder iEncoder;

    // 외부에서 객체를 주입받아서 관리하면 의존적인 부분을 상대방한테 받으므로 그에 따라 움직일수 있다. 이는 코드관리가 편리해진다는 것을 의미한다.
    public Encoder(IEncoder iEncoder){
       this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
