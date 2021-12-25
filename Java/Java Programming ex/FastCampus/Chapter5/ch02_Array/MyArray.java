package ch02_Array;
/*
 * 동일한 데이터 타입을 순서에 따라 관리하는 자료구조
 * 정해진 크기가 존재
 * 요소의 추가와 제거시 다른 요소들의 이동이 필요함
 * 배열의 i번째 요소를 찾는 인덱스 연산이 빠름
 * jdk 클래스 : ArrayList , Vector
 */
public class MyArray {
	
	// 클래스 내부에서 사용될 변수들을 선언한다. 이떄 public으로 선언된건 패키지 내부의 모든 클래스에서 사용이 가능하며 static final로 선언된 ERROR_NUM은 수정이 불가능한 변수이다.
	
	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		// 생성자 : size가 주어지지 않았을 경우 사용되는 기본생성자이다.
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
		// 기본 생성자는 기본적으로 size가 주어져있지 않기에 size를 따로 10으로 지정해서 사용한다. 
	}
	
	public MyArray(int size)
	{ /*
	   * size가 주어진 생성자이다. 
	   * 이 생성자의 경우 size가 주어졌기에 따로 앞의 생성자처럼 
	   * 사이즈가 고정된 것이 아닌 주어진 사이즈를 통해 배열의 크기를 정한다.
	   */
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num)
	{/*
	  * 배열의 메소드 중에 num이 주어진 경우이다.
	  * 만약 생성자를 통해 만들어진 객체의 크기를 정하는 count가 배열의 크기, array_size를 넘어가면
	  * 출력문을 출력하고 그대로 return으로 종료가 된다.
	  * 그것이 아닐경우 count에 해당 num값을 넣고 count 값을 1증가시킨다.
	  * 이 메소드의 경우 차례대로 넣고 끝갑셍 넣는 형식이다.
	  */
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	public void insertElement(int position, int num)
	{
		int i;
		if(position <0 || position  > count) {
			System.out.println("not enough memory");
			return ;
		}
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		for( i = count - 1;i>=position;i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] =num;
		count++;
			
	}
	
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		if( isEmpty() ){
			System.out.println("There is no element");
			return ret;
		}
		
		if(position < 0 || position >= count ){  //index error
			System.out.println("remove Error");
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}


