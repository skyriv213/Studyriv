package com.example.IoC_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class IoCDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoCDiApplication.class, args);


		ApplicationContext context = ApplicationContextProvider.getContext();

//		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
// 		Encoder encoder = new Encoder(base64Encoder);

		Encoder encoder = context.getBean("urlEncode",Encoder.class);

		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		Encoder encoder1 = new Encoder(urlEncoder);

		String url = "www.nave.com/books/it?page = 10&size=20&name=spring-boot";

		String result = encoder.encode(url);

		String result1 = encoder1.encode(url);

		System.out.println(result);

		System.out.println(result1);
	}

}

@Configuration
class Appdonfig{

	@Bean("base64Encode")
	public Encoder encoder(Base64Encoder base64Encoder){
		return  new Encoder(base64Encoder);
	}
	@Bean("urlEncode")
	public Encoder encoder(UrlEncoder urlEncoder){
		return  new Encoder(urlEncoder);
	}



}