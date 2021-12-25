package ch10_class;

public class PasswordTest {
	
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws Password {
		if(password ==null) {
			throw new Password("비밀번호는 null 일 수 없습니다");
		}
		else if(password.length()<5) {
			throw new Password("비밀번호는 5자 이상이어야합니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new Password("비밀번호는 숫자나 특수문자 포함해야 합니다");
		}
		
		this.password = password;
		
	}

	public static void main(String [] args) {
		PasswordTest  test =  new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류없음 1");
		}
		catch(Password e) {
			System.out.println(e.getMessage());
		}
		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("오류없음2");
		}
		catch(Password e) {
			System.out.println(e.getMessage());
		}
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("오류없음3");
		}
		catch(Password e) {
			System.out.println(e.getMessage());
		}
		password = "abcde#1";
		try {
			test.setPassword(password);
			System.out.println("오류없음4");
		}
		catch(Password e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
