package week11_2;

class Printer {
	synchronized void print(int[] arr) {
		for(int v: arr) {
			System.out.print(v + " ");
			try {
				Thread.sleep(100); 
			} catch(Exception e) {}
		}
	}
}
class MyThread1 extends Thread {
	Printer prn;
	int[] myarr = {10, 20, 30, 40, 50};
	public MyThread1(Printer prn) {this.prn = prn;}
	public void run() {
		prn.print(myarr);
	}
}
class MyThread2 extends Thread {
	Printer prn;
	int[] myarr = {1, 2, 3, 4, 5};
	public MyThread2(Printer prn) {this.prn = prn;}
	public void run() {
		prn.print(myarr);
	}
}
public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj = new Printer();
		new MyThread1(obj).start();
		new MyThread2(obj).start();
	}

}
