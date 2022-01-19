package com.example.response.Controller;


import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // Text
    @GetMapping("/text")
    public String  text(@RequestParam String account ){
        return account;
    }

    // JSON
    // req -> object mapper -> object -> mathod -> object - > object mapper-> json -> response
    // user 라는 바디를 requestbody로 받아서 user로 리턴
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return  user; // 200 ok
    }

    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        // ResponseEntity를 통해 명확하게 값을 만들어서 선언해주는것이 좋다
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
     /*
    ResponseEntity<o> : spring framework에서 제공하는 클래스 중에 HttpEntity라는 클래스가 존재
    이것은 HTPP 요청(Request) 또는 응답(Response)에 해당하는 HttpHeader와 HttpBody를 포함하는 클래스
    이러한 HttpEntity 클래스를 상속받아 구현한 클래스가 RequestEntity, ResponseEntity 클래스이다.
    ResponseEntity는 사용자의 HttpRequest에 대한 응답 데이터를 포함하는 클래스이다.
    따라서 HttpStatus, HttpHeaders, HttpBody를 포함한다.
    */


}
