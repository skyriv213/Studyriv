package ch08_Exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 클로즈 되었습니다");		
	}
 
}
