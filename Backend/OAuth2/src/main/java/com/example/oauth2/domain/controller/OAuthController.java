package com.example.oauth2.domain.controller;

import com.example.oauth2.domain.entity.User;
import com.example.oauth2.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OAuthController {
    private final BCryptPasswordEncoder encoder;
    private final UserRepository memberRepository;

    @GetMapping("/loginForm")
    public String home() {
        return "loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(User user) {
        String rawPwd = user.getPassword();
        System.out.println("member = " + user);
        user.setRole("ROLE_USER");
        user.setPassword(encoder.encode(rawPwd));
        memberRepository.save(user);
        return "redirect:/loginForm";
    }

    @GetMapping("/private")
    public String privatePage() {
        return "privatePage";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "adminPage";
    }
}