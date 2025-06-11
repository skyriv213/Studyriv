package com.example.spel;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class LanguageReferenceTest {


    @Test
    //collection이나 map이 아닌 경우
    public void rootTest() {
        var inventor = new Inventor("A", "C");
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("#root['name']");
        var name = expression.getValue(inventor, String.class);
        assertThat(name).isEqualTo("a");
    }

    @Test
    public void inlineMapTest() {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        List expression = (List) spelExpressionParser.parseExpression("{1,2,3}")
                .getValue();
        assertThat(expression).containsExactly(1, 2, 3);
    }

    @Test
    public void inlineMap() {
        var parser = new SpelExpressionParser();
        var Map = (Map) parser
                .parseExpression("{name:'a',country:'c'}")
                .getValue();
        assertThat(Map.get("country")).isEqualTo("c");
    }

    @Test
    public void arrayContructorTest() {
        SpelExpressionParser parser = new SpelExpressionParser();
        var arr = (int[]) parser.parseExpression("new int[3]")
                .getValue();
        assertThat(arr.length).isEqualTo(3);
    }


    @Test
    public void relationalOperatiorTest() {
        var parser = new SpelExpressionParser();
        var expression = parser.parseExpression("1 < 2");
        var result = expression.getValue(Boolean.class);

        assertThat(result).isTrue();
        // 아래처럼 바꿔쓸수도 있다
        // lt (<)
        // gt (>)
        // le (<=)
        // ge (>=)
        // eq (==)
        // ne (!=)
    }

    @Test
    public void betweenTest() {
        var parser = new SpelExpressionParser();
        var expression = parser.parseExpression("1 between {0,2}");
        var result = expression.getValue(Boolean.class);
        assertThat(result).isTrue();
    }




}
