package week12;

class myException extends Exception {
	public myException() {
		super("내가 만든 사용자 정의 예외 클래스 ");
	}
}
public class Exception1 {
	public void myMethod() throws myException {
		throw new myException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1 k = new Exception1();
		try {
			k.myMethod();
		}
		catch(myException e) {
			System.err.println(e.getMessage() + ":::");
			System.out.println("호출스택내용 : ");
			e.printStackTrace();
		}
	}

} 