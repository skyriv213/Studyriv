package ch02_Array;
/*
 * ������ ������ Ÿ���� ������ ���� �����ϴ� �ڷᱸ��
 * ������ ũ�Ⱑ ����
 * ����� �߰��� ���Ž� �ٸ� ��ҵ��� �̵��� �ʿ���
 * �迭�� i��° ��Ҹ� ã�� �ε��� ������ ����
 * jdk Ŭ���� : ArrayList , Vector
 */
public class MyArray {
	
	// Ŭ���� ���ο��� ���� �������� �����Ѵ�. �̋� public���� ����Ȱ� ��Ű�� ������ ��� Ŭ�������� ����� �����ϸ� static final�� ����� ERROR_NUM�� ������ �Ұ����� �����̴�.
	
	int[] intArr;   	//int array
	int count;  		//����
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		// ������ : size�� �־����� �ʾ��� ��� ���Ǵ� �⺻�������̴�.
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
		// �⺻ �����ڴ� �⺻������ size�� �־������� �ʱ⿡ size�� ���� 10���� �����ؼ� ����Ѵ�. 
	}
	
	public MyArray(int size)
	{ /*
	   * size�� �־��� �������̴�. 
	   * �� �������� ��� size�� �־����⿡ ���� ���� ������ó�� 
	   * ����� ������ ���� �ƴ� �־��� ����� ���� �迭�� ũ�⸦ ���Ѵ�.
	   */
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num)
	{/*
	  * �迭�� �޼ҵ� �߿� num�� �־��� ����̴�.
	  * ���� �����ڸ� ���� ������� ��ü�� ũ�⸦ ���ϴ� count�� �迭�� ũ��, array_size�� �Ѿ��
	  * ��¹��� ����ϰ� �״�� return���� ���ᰡ �ȴ�.
	  * �װ��� �ƴҰ�� count�� �ش� num���� �ְ� count ���� 1������Ų��.
	  * �� �޼ҵ��� ��� ���ʴ�� �ְ� ������ �ִ� �����̴�.
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
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
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


