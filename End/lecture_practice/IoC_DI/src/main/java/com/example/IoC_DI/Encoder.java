package com.example.IoC_DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class Encoder  {

    private IEncoder iEncoder;

    // 외부에서 객체를 주입받아서 관리하면 의존적인 부분을 상대방한테 받으므로 그에 따라 움직일수 있다. 이는 코드관리가 편리해진다는 것을 의미한다.
    public Encoder(@Qualifier("base74Encoder") IEncoder iEncoder){
       this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }

}
