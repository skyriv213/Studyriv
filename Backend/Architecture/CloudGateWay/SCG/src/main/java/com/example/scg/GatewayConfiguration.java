package com.example.scg;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class GatewayConfiguration {

    @Value("${service.ms1}")
    private String ms1Uri;  // URI로 바로 받으셔도 되지만, String으로 받은 뒤 URI.create(…) 해도 무방합니다.
//    @Value("${service.ms2}")
//    private String ms2Uri;

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return
                builder.routes()
                        .route("ms1", r -> r.path("/ms1/**")
                                .filters(f -> f.stripPrefix(1))  // <- 이 줄 추가
                                .uri("lb://MS1"))


//                        .route("ms2", r -> r.path("/ms2/**")
//                                .filters(f -> f.stripPrefix(1))  // <- 이 줄 추가
//                                .uri(ms2Uri))
                        .build();

    }

}
