package week12;

class MyThread6 implements Runnable {
	String name;
	
	public MyThread6(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.print(name + i + ":");
		}
	}
}
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread6("H"));
		Thread t2 = new Thread(new MyThread6("S"));
		
		t1.start();
		t2.start();
	}

}
