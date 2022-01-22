package com.example.Object_Mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ObjectMapperApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		// 강의 진행 중 j-unit을 배울때 test 코드 작성 방법을 배울 예정
		System.out.println("hello");

		/*
		Text Json -> object
		object -> text Json

		controller에서 request로 text가 들어오면 object로 변환
		response object로 리턴하게 되면 자연스럽게 json(Text)으로 변환

		 */

		var objectMapper = new ObjectMapper();

		// object -> text

		var user = new User("Steve",10,"010-1111-2222");
		var text = objectMapper.writeValueAsString(user); // 주어진 값을 String으로 변환
		// 1. objectMapper는 get메소드를 참조한다. 따라서 바꾸고자 하는 객체에서 getter 메소드를 생성해줘야한다.

		System.out.println(text);


		//text -> object
		var objectUser = objectMapper.readValue(text, User.class);
		// 2. objectMapper는 동작하기 위해 기본 디폴트 생성자를 필요로 한다.
		System.out.println(objectUser);

	}

}
