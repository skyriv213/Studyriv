package com.example.scg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class L1Filter extends AbstractGatewayFilterFactory<L1Filter.Config> {

    public L1Filter() {

        super(Config.class);
    }


    @Override
    public GatewayFilter apply(Config config) {

        return (exchange, chain) -> {

            if (config.isPre()) {
                System.out.println("pre local filter 1");
            }

            return chain.filter(exchange)
                    .then(Mono.fromRunnable(() -> {

                        if (config.isPost()) {

                            System.out.println("post local filter 1");
                        }
                    }));
        };
    }

    public static class Config {
        private boolean pre;
        private boolean post;

        public Config() {}

        public Config(boolean pre, boolean post) {
            this.pre = pre;
            this.post = post;
        }

        public boolean isPre() {
            return pre;
        }

        public boolean isPost() {
            return post;
        }

        public void setPre(boolean pre) {
            this.pre = pre;
        }

        public void setPost(boolean post) {
            this.post = post;
        }
    }

}