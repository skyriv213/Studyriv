package com.company.design.Proxy;

public class BrowserProxy implements IBrowser{
    private String url;
    private HTML html;


    // 생성자
    public BrowserProxy(String url){
        this.url =url;
    }

    @Override
    public HTML show() {
        // 만약 html의 값이 비워져있는 값이면 HTML 객체에 html 넣어주기

        if(html ==null){
            this.html = new HTML(url);
            System.out.println("BrowserProxy loading html from :" +url);
        }
        System.out.println("BrowserProxy cache html from :" +url);
        return html;
        // 그게 아니면 자기 자신이 가지고 있는 html return
    }
}
