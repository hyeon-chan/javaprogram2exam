package week11_2;

public class ex09 extends Thread{
	public void run() {
		for(int i=1; i<=3; i++) 
			System.out.println(getName() + " " + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ex09 t1 = new ex09();
		ex09 t2 = new ex09();
		
		t1.start();
		try {
			t1.join();
		} catch(Exception e) {}
		t2.start();
		
	}

}
