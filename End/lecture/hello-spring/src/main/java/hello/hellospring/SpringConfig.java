package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

   /* private DataSource dataSource;
    private EntityManager em;*/

    private final MemberRepository memberRepository;

    @Autowired // constructer가 하나일 때는 따로 안적어도 되지만 기입
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }



   /* public SpringConfig(EntityManager em) {
        this.em = em;
    }*/

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }


//    @Bean // 특정하게 구현되는 애플래케이션의 객체를 표현하기위해 Bean을 쓰기도함. @component 혹은 @Bean 사용
//    public TimeTraceAop timeTraceAop(){
//        return new TimeTraceAop();
//    }
//    @Bean
//    public MemberRepository memberRepository() {
//        //return new MemoryMemberRepository();
//        //return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
