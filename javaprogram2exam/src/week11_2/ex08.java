package week11_2;

public class ex08 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String[] messages = {"봄", "여름", "가을", "겨울"};
		for(String m : messages) {
			Thread.sleep(1000);
			System.out.println(m);
		}
	}

}
