package com.example.spel;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.client.RestClient;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
public class ExpressionInBeanDefinitionsTest {

    @Autowired
    private Environment environment;

    @Test
    public void environmentTest() {
        // 애플리케이션 속성
        assertThat(environment.getProperty("java.version")).isEqualTo("17.0.14");
    }

    @Test
    public void systemEnvironmentTest() {

        assertThat(System.getenv("JAVA_HOME"))
                .isEqualTo(null);
    }

    // SpEL을 통해 시스템 속성 및 환경 변수를 읽어오는 방법
    @Value("#{systemProperties['java.version']}")
    private String javaVersion;

    @Value("#{systemEnvironment['JAVA_HOME']}")
    private String javaHome;

    @Value("#{2+3}")
    private Integer two;

    @Value("${skyriv.name}")
    private String skyrivName;


    @Test
    public void simpleExpressionTest() {
        assertThat(two).isEqualTo(5);
    }

    @Test
    public void applicationPropertyTest() {

        assertThat(skyrivName).isEqualTo("skyriv");
    }

    @TestConfiguration
    public static class TestConfig {
        @Bean
        public RestClient restClient(RestClient.Builder builder
                , @Value("#{environment['skyriv.restclient.url']}") String url) {
            // @Value("${skyriv.restclient.url}") String url) {
            // "${}" 는 application(.properties, .yml) 속성값을 가져올 때 사용한다.
            return builder.baseUrl(url).build();
        }
    }

    @Value("#{restClient}")
    private RestClient restClient;

    @Test
    public void testBeanProperty() {
        assertThat(restClient)
                .isInstanceOf(RestClient.class);

    }
}
