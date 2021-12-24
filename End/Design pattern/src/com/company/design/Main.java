package com.company.design;

import com.company.design.AOP.AopBrowser;
import com.company.design.Adapter.*;
import com.company.design.Decorator.*;
import com.company.design.Facade.FTP;
import com.company.design.Facade.Reader;
import com.company.design.Facade.SFtpClient;
import com.company.design.Facade.Writer;
import com.company.design.Observer.Button;
import com.company.design.Observer.IButtonListener;
import com.company.design.Proxy.Browser;
import com.company.design.Proxy.BrowserProxy;
import com.company.design.Proxy.IBrowser;
import com.company.design.Singleton.Aclass;
import com.company.design.Singleton.Bclass;
import com.company.design.Singleton.SocketClient;
import com.company.design.Strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void connect(Electronic110v electronic110v){
            electronic110v.poweron();
        }

    public static void main(String[] args) {
        // 싱글톤 패턴 학습 예제
//        Bclass b = new Bclass();
//        Aclass a = new Aclass();
//
//        SocketClient aclient = a.getSocketClient();
//        SocketClient bclient = b.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aclient.equals(bclient));
//
        // 어뎁터 패턴 학습 예제
//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//
//
//        Cleaner cleaner = new Cleaner();
//        Electronic110v adapter = new SocketAdapter(cleaner);
//        connect(adapter);
//        AirConditioner airConditioner =new AirConditioner();
//        Electronic110v adapter2 =new SocketAdapter(airConditioner);
//        connect(adapter2);
//

        // 프록시 패턴 학습 예제
//        Browser browser =  new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        // AOP 관점지향 프로그래밍 예제
//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//
//        IBrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//
//                }
//        );
//        aopBrowser.show();
//        System.out.println("loading time:"+(end.get()));
//
//        aopBrowser.show();
//        System.out.println("loading time:"+(end.get()));
//
//    }
        // 데코레이터 패턴 학습 에제
//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
//        // a3
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//        // a4
//        ICar audi4 = new A4(audi,"A4");
//        audi4.showPrice();
//        // a5
//        ICar audi5 = new A5(audi,"A5");
//        audi5.showPrice();

        // 옵저버 패턴 학습 예제
//        Button button = new Button("버튼");
//
//        button.addListener(new IButtonListener(){
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//
//        button.click("메세지 전달 : click 1");
//        button.click("메세지 전달 : click 2");
//        button.click("메세지 전달 : click 3");
//        button.click("메세지 전달 : click 4");
//        button.click("메세지 전달 : click 5");

        //파사드 패턴 학습 예제
//        FTP ftpclient = new FTP("www.foo.co.kr",22,"/home/etc");
//
//        ftpclient.connect();
//        ftpclient.moveDirectory();
//
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//
//        reader.fileDisconnect();
//        writer.fileDisConnect();
//        ftpclient.disConnect();
//
//        SFtpClient sFtpClient = new SFtpClient("www.foo.co.kr",22,"/home/etc","text.tmp");
//
//        sFtpClient.connect();
//
//        sFtpClient.write();
//
//        sFtpClient.read();
//
//        sFtpClient.disConnect();

        // 전략 패턴 학습 예제
        Encoder encoder = new Encoder();

        //Base64
        EncodingStrategy base64 = new Base64Strategy();

        //normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello world";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String apppendResult = encoder.getMessage(message);
        System.out.println(apppendResult);
    }
}
