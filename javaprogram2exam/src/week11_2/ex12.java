package week11_2;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String res1 = "Gold";
		final String res2 = "Silver";
		
		Thread t1 = new Thread(()-> {
			synchronized(res1) {
				System.out.println("Thread1: 자원1 휙득");
				try {
					Thread.sleep(100);
				} catch(Exception e) {}
				synchronized (res2) {
					System.out.println("Thread1: 자원2 휙득");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
				synchronized (res1) {
				System.out.println("Thread2: 자원1 휙득 ");
				try {
					Thread.sleep(100);
				} catch(Exception e) {
				}
				synchronized (res2) {
					System.out.println("Thread2: 자원2 휙득 ");
				
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
