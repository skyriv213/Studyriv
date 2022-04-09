package hello.core.common;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS) // 값이  하나면 value 생략 가능 , 그러나 2개 이상이면 value값 필요
public class MyLogger {

    private String uuid;
    private String requestURL;

    public void setRequestURL(String requestURL){
        this.requestURL = requestURL;
    }

    public void log(String message){
        System.out.println("[" +  uuid + "]" + "[" + requestURL + "] "+ message);

    }
    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();
        System.out.println("[" +  uuid + "] request scope bean create" +  this );
    }

    @PreDestroy
    public void close(){
        System.out.println("[" +  uuid + "] request scope bean close" +  this );

    }
}
