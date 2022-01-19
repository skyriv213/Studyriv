package com.example.response.Controller;


import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    /*
    Controller의 경우 html 리소스 페이지를 찾게 되며 리턴함
     */

    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    //ResponseEntity

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User(); // var 타입 추론 변수
        user.setName("kim");
        user.setAddress("일산");
        return user;

        }
    }

