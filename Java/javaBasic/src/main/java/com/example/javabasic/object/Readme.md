<pre>
구현해야하는 객체

종업원
- 주문받기
- 청소하기
- 재고파악하기

손님 - people interface / seats customer or take out customer
- int money / type / 등급 / 주문 음료
- 주문하기 ( 잔고 확인 후 메뉴 확인 )
- 현재 잔고 확인하기 (get)
- 좌석에 앉기 - random 변수 돌리기 ( 1~5 좌석 / 6-9 테이크 아웃) 

카페 - main
- 매출확인 - int sales
- 좌석확인 - int seats
- 메뉴 리스트 보여주기 (get으로 확인된 잔고를 바탕으로 메뉴판에서 주문 가능한 메뉴 보여주기 - stream 사용)

메뉴 
- 음료 ( 온도 / 가격 / 용량 / 칼로리 ) - drink interface
    - 온도: temperature /  price / ml / kcal
- 디저트 ( 가격 / 맛 / 칼로리 ) - food interface
    - price / fevor -  enum / kcal
</pre>
