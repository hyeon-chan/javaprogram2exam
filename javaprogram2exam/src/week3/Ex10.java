package week3;

class ArrObject {
	int[] data;
	
	ArrObject() {
		data = new int[] {10, 20, 30, 40, 50};
	}
	
	ArrObject(int[] data) {
		this.data = data;
	}
	
	void print() {
		for(int n:data) {
			System.out.print(n);
		}
	}
	
}

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrObject k = new ArrObject();
		
		k.print();
		
		k = new ArrObject(new int[] {100, 200, 300});
		k.print();
		
		new ArrObject(new int[] {1, 2, 3}).print();
	}

}

