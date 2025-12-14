package week11_2;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
	}
}
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new MyRunnable());
		t.start();
	}

}
