package com.example.javabasic.ch03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class app {
    public static void main(String[] args) {
        List<Lecture> springClasses = new ArrayList<>();
        springClasses.add(new Lecture(1, "spring boot", true));
        springClasses.add(new Lecture(2, "spring data jpa", true));
        springClasses.add(new Lecture(3, "spring mvc", false));
        springClasses.add(new Lecture(4, "spring core", false));
        springClasses.add(new Lecture(5, "rest api development", false));

        List<Lecture> Classes = new ArrayList<>();
        Classes.add(new Lecture(6, "The Java, Test", true));
        Classes.add(new Lecture(7, "The Java, Code manipulation", true));
        Classes.add(new Lecture(8, "The Java, 8 to 11", false));

        List<List<Lecture>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(Classes);

        System.out.println("spring 으로 시작하는 수업");
        // TODO
        springClasses.stream()
                .filter(s->s.getTitle().startsWith("spring"))
                .forEach(s-> System.out.println(s.getId()));

        System.out.println("close 되지 않은 수업");
        // TODO
        springClasses.stream()
                .filter(Predicate.not(Lecture::isClosed))
                .forEach(s -> System.out.println(s.getTitle()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        // TODO
        springClasses.stream().map(Lecture::getTitle)
                .forEach(System.out::println);


        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        // TODO
        keesunEvents.stream()
                .flatMap(Collection::stream)
                .forEach(oc -> System.out.println(oc.getTitle()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        // TODO
        Stream.iterate(50,i->i+2)
                .skip(50)
                .limit(10)
                        .forEach(System.out::println);
        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        // TODO
        boolean test1 = Classes.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        boolean test2 = Classes.stream().allMatch(oc -> oc.getTitle().contains("Test"));
        boolean test3 = Classes.stream().noneMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 것만 모아서 List로 만들기");
        // TODO
        List<String> spring = springClasses.stream()
                .map(Lecture::getTitle)
                .filter(s -> s.contains("spring"))
                .collect(Collectors.toList());
        spring.forEach(System.out::println);


        List<Integer> in = new ArrayList<>();
        for(int i =0; i<10;i++){
            in.add(i);
        }
        in.stream().map(i->i*10).forEach(System.out::println);
        in.stream().filter(i -> i > 5).forEach(System.out::println);
        in.stream().map(i->i*10)
                .filter(i->i>50)
                .forEach(System.out::println);

    }

}

