package com.example.HelloSpring.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    // http://localhost:9090/api/get/hello , default로 작성하는것이 아닌 path를 사용시 명확하게 사용 할 수 있도록  지정해줄 수 있다
    // 현재 사용을 하는 방식
    public String Hello() {
        return "Helllllllo~~~~~ get !";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    // 만약에 경로를 지정하지 않으면 get / post / put / delete 의 모든 메소드에서 작동을 하며 mapping이 될 수 있다.
    // get만의 속성이 지정이 되며 http://localhost:9090/api/get/hi
    // 예전에 사용을 하던 주소맵핑 방법
    public String hi(){
        return "hi";
    }


    // http://localhost:9090/api/get/path-variable/{name1}
    // http://localhost:9090/api/get/path-variable/{name2}
    // http://localhost:9090/api/get/path-variable/{name3}

    @GetMapping("/path-variable/{id}/{name}")
    public String pathVariable( @PathVariable("name") String pathName,@PathVariable("id") String a){
        // 반드시 어노테이션 GetMapping 의 괄호 안에 변수명과 함수 안의 변수명이 동일해야
        System.out.println("PathVariable : " + a + "\t"+ pathName);
        return a + "\t" + pathName;
    }

    //Query parameter :  검색을 할 때 나오는 여러가지 매개변수 인자를 의미, 주로 검색할 때 사용
    // search?q = %ED%86%B0%EC%BA%A3
    // &oq = %ED%86%B0%EC%BA%A3
    // &aqs = chrome..69i57j0i512l9.2297j0j7
    // &sourceid = chrome
    // &ie = UTF-8

    // ?key = value&key2=value2 -> 처음 키를 받고 그 다음 key를 받기 위해서는 & 연산자 필요

    // http://localahost:9090/api/get/query-param?user=strve
    // &email=steve@gamil.com
    // &age=30


}
