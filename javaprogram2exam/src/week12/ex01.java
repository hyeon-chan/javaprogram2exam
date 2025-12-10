package week12;

class MyException extends Exception {
	public MyException() {
		super("내가 만든 사용자 정의 예외 클래스 ");
	}
}
	public class ex01 {
		public void myMethod() throws MyException {
			throw new MyException();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex01 k = new ex01();
		
		try {
			k.myMethod();
		}
		catch(MyException e) {
			System.out.println(e.getMessage() + ":::");
			System.out.println("호출스택내용 : ");
			e.printStackTrace();
		}
	}

}
