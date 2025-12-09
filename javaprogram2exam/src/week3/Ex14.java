package week3;

abstract class exaa {
	int[] data;
	exaa() {
		data = new int[] {10, 30, 25, 5, 50, 20};
	}
	abstract void Uswap();
	abstract void print();
 }
public class Ex14 extends exaa {
	void Uswap() {
		for(int i=0; i<data.length-1; i++ ) {
			for(int j=i+1; j<data.length; j++) {
				if(data[i]>data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
			}
		}
	}
	}
	void print() {
		System.out.print("배열에 저장된 데이터: ");
		for(int n:data) {
			System.out.print(n + " ");
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 k = new Ex14();
		k.print();
		k.Uswap();
		k.print();
	}

}
