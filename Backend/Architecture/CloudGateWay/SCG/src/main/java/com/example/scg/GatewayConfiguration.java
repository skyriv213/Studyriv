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

    private final L1Filter l1Filter;

    public GatewayConfiguration(L1Filter l1Filter) {
        this.l1Filter = l1Filter;
    }

    @Value("${service.ms1}")
    private String ms1Uri;

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("ms1", r -> r.path("/ms1/**")
                        .filters(f -> f
                                .stripPrefix(1)
                                .filter(l1Filter.apply(new L1Filter.Config(true, true)))
                        )
                        .uri("lb://MS1"))
                .build();
    }
}
