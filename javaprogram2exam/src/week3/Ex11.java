package week3;
	

class Ex {
	int x, y, temp;
	
	Ex() {
		x = 10;
		y = 20;
	}
	
	void eprint() {
		System.out.printf("x=%d, y=%d", x, y);
	}
	
	void eswap() {
		temp = x;
		x = y;
		y = temp;
	}
	
}
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex k = new Ex();
		
		k.eprint();
		k.eswap();
		k.eprint();
	}

}
