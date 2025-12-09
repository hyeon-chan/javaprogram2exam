package last;

abstract class ex02abs {
	abstract void eArray();
	abstract void print();
}
class ex02ex extends ex02abs{
	int[] data;
	int temp;
	public ex02ex() {
		data = new int[] {100, 1, 27, 88, 15, 45, 37};
	}
	public void eArray() {
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i]>data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
	public void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			if(i<data.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
public class ex02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02ex k = new ex02ex();
		k.eArray();
		k.print();
	}

}
