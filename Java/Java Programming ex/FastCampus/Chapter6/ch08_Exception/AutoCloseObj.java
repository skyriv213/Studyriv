package ch08_Exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� Ŭ���� �Ǿ����ϴ�");		
	}
 
}
