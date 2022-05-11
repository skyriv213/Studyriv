package com.study.stackintelli.config.auth.dto;

import com.study.stackintelli.domain.user.User;
import lombok.Getter;

@Getter
// 인증된 사용자 정보만 필요
public class SessionUser {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();

    }
}
