package week12;

class NumberThread extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Number: " + i);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class LetterThread extends Thread {
	public void run() {
		for(char ch='A'; ch<='E';ch++) {
			System.out.println("Letter: " + ch);
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread nt = new NumberThread();
		Thread lt = new LetterThread();
		
		nt.start();
		lt.start();
		
		try {
			nt.join();
			lt.join();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		System.out.println("프로그램을 종료합니다. ");
		}
	}

}
