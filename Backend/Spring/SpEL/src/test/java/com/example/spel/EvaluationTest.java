package com.example.spel;

import org.junit.jupiter.api.Test;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluationTest {


//    @Test
//    void contextLoads() {
//    }

    @Test
    // 리터럴 문자열 표현식을 평가하는 방법
    // parseExpression() 표현식으로 파싱 후 getValue() 실행
    public void literalEvalTest() {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("'hello world'");
        String value = (String)expression.getValue(); // 처음 표현식에서 값을 가져오면

        assertThat(value).isEqualTo("hello world");
    }



    @Test
    // 클래스 내의 객체의 값(name)을 꺼내오는 것을 보여주는 예제
    public void spelGeneralEvalTest() {
        var inventor = new Inventor("AlbertEinstein", "Germany");
        var spelExpressionParser = new SpelExpressionParser();
        var expression = spelExpressionParser.parseExpression("name");
        var name = expression.getValue(inventor, String.class);
        assertThat(name).isEqualTo("AlbertEinstein");
    }


    @Test
    // 컬렉션 필터링, primes 변수에서 10보다 큰 요소 필터링
    // # this로 현재 요소를 참조
    public void variableTest() {
        List<Integer> primes = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10,11,13);
        SpelExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        context.setVariable("primes", primes); // context에 변수 선언

        String s = "#primes.?[#this>10]"; // #: 변수명 앞에 붙여준다. .? 해당 객체가 존재하는지 판딘, #this = primes를 사용
        List value = parser.parseExpression(s).getValue(context, List.class);
        assertThat(value).containsExactly(11,13);
    }

}
class Inventor {
    public String name;
    public String country;

    public Inventor(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
