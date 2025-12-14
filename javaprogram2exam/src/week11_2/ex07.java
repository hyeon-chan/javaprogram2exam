package week11_2;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			for(int i=0; i<10; i++) {
				System.out.print(i + " ");
			}
		};
		new Thread(task).start();
	}

}
