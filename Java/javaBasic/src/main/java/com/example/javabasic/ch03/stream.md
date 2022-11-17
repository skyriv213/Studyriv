- collection - 데이터를 가지고 있는 저장소 개념
- stream - collection을 소스로 가지고 처리를 하는것 


<h2>스트림의 특징</h2>
- 데이터를 담고 있는 컬렉션이 아니다
- 스트림이 처리하는 데이터 소스를 변경하지않는다
- 스트임으로 처리하는 데이터는 오직 한번만 처리가 된다
- 무제한일 수도 있다 -> short circuit 메서드를 사용해서 제한할 수 있다.
- 중개 오퍼레이션은 근본적으로 lazy하다
- 손쉽게 병렬 처리가 가능하다

<h2>스트림 파이프라인</h2>
- 0 또는 다수의 중개 오퍼레이션(intermediate operation)과 한 개의 종료 오퍼레이션(terminal operation)으로 구성됨
- 스트임의 데이터 소스는 오직 터미널 오퍼레이션을 실행할 때만 처리가 됨

<h2>중개 오퍼레이션</h2>
- stream을 리턴
- stateless / stateful 오퍼레이션으로 더 상세하게 구분 가능
  - 대부분 stateless지만 distict나 sorted처럼 이전 소스 데이터를 참조해야 하는 오퍼레이션은 stateful 오퍼레이션
- filter /  map / limit / skip / sorted / ...

<h2>종료 오퍼레이션</h2>
- stream을 리턴하지않는다
- collect,, allMatch, count, forEach, min, max ...
