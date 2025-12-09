package week4;

interface ex07inf {
	void eArray();
	void print(String msg);
}

class ex06base1 {
	int[] data;
	void baseprint() {
		System.out.print("기본데이터: ");
		for(int n : data)
			System.out.printf("%d ", n);
		System.out.println();
	}
}

public class ex07 extends ex06base1 implements ex07inf{
	
	public ex07() {
		data = new int[] {10, 40, 50, 90, 100, 45, 76, 15, 3, 55};
	}
	
	public void eArray() {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length;j++) {
				if(data[j] > data[i]) {
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
	}
	
	public void print(String msg) {
		System.out.print(msg);
		for(int n:data)
			System.out.printf("%d ", n);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex06 k = new ex06();
		k.baseprint();
		k.print("for each 적용 데이터: ");
		k.eArray();
		k.print("오름차순 데이터: ");
		
	}

}