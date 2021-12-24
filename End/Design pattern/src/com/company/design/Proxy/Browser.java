package com.company.design.Proxy;

public class Browser implements IBrowser {

    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public HTML show() {
        System.out.println("browser loading html from :" + url);
        return new HTML(url);
    }
    // 브라우저에서 어떤 페이지를 볼때 매번 새로운 주소를 보여주면서 로딩을 하는 형태
}
