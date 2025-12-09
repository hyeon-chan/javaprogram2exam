package week10_2;

public class DevideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;
		int z;
		try {
			z = x/y;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}
