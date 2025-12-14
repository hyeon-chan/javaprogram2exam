package week11_2;

class MyThread extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
	}
}
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new MyThread();
		t.start();
	}

}
