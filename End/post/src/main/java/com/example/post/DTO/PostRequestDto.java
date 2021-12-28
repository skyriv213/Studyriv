package com.example.post.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {
    // 요청하는 json의 키와 꼭 매칭이 되어야한다
    private String account;
    private String  email;
    private String address;
    private String password;
    @JsonProperty("phone_number")
    private String phoneNumber;
    // phone_number , 예시에서 해당 명시된 변수의 이름이 틀릴시 값은 들어가지않고 null값으로 들어간다.
    // 여러가지 해결방안 중 하나는 JsonProperty라는 어노테이션을 사용해서 입력해주면 된다.

    @JsonProperty("OTP")
    private String OTp;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOTp() {
        return OTp;
    }

    public void setOTp(String OTp) {
        this.OTp = OTp;
    }

    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", OTp='" + OTp + '\'' +
                '}';
    }
}
