package Hello.Hellospring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpring1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpring1Application.class, args);
		/*
		 SpringApplication.run(해당하는 class명)을 넣어주고 실행을 하면 스프링부트 어플리케이션이 실행이 된다.
		 이를 실행시 내장되어 있는 tomcat이라는 웹서버를 내장하고 있음. 이러한 내장 서버를 띄우면서 자체적으로 실행이 된다.

		 */

	}

}
