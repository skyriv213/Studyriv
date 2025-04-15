# 함수형 인터페이스와 람다 표현식

## 함수형 인터페이스
- 추상 메서드를 하나만 가지고 있는 인터페이스
- SAM (Single abstract Method) 인터페이스
- @FunctionInterface 어노테이션을 가지고 있는 인터페이스


## 람다 표현식 - Lambda Expressions
- 함수형 인터페이스의 인터페이스를 만드는 방법으로 사용 가능
- 코드를 줄일 수 있음
- 메서드 매개변수, 리턴타입, 변수로 만들어서 사용가능

## 자바에서 함수형 프로그래밍
- 함수를 First class object로 사용 가능
- 순수 함수 (Pure Function)
  - side effect X -> 함수 밖에 있는 값을 변경하지 않음
  - 상태가 없음 -> 함수 밖에 있는 값을 사용하지 않음
- 고차 함수 (Higher Order Function)
  - 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수 있음
- 불변성

## Java 에서 제공하는 함수형 인터페이스
- java.lang.function 패키지
- java에서 미리 정의한 자주 사용할만한 함수 인터페이스
- Function<T,R>
  - T 타입을 받아서 R 타입 리턴 / R apply(T t)
  - 함수 조합용 메소드 / andThen, compose
- BiFunction<T,U,R>
  - 두 개의 값(T,U)를 받아서 R 타입을 리턴하는 함수 인터페이스 / R apply(T t, U u)
- Consumer<T>
  - T 타입 값을 받아서 아무 값도 리턴하지 않는 함수 인터페이스 / void Accept(T t)
  - 함수 조합용 메서드 / andThen
- Supplier<T>
  - T 타입의 값을 제공하는 함수 인터페이스 / T get()
- Predicate<T>
  - T 타입을 받아서 boolean을 리턴하는 함수 인터페이스 / boolean test(T t)
  - 함수 조합용 메서드 / And, Or, Negate
- UnaryOperator<T>
  - Function<T,R>의 특수 형태, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스 
- BinaryOperator<T>
  - BiFunction<T,U,R>의 특수한 형태, 동일환 타입 입력값 두개를 받아서 리턴하는 함수 인터페이스
