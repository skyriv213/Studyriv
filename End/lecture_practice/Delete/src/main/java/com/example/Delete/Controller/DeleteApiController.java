package com.example.Delete.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);
        
        //delete -> 리소스 삭제  200 ok , 있는 상태에서 삭제 요청 혹은 없는상태에서 삭제요청 어느것이든 결과값 동일
    }
}
