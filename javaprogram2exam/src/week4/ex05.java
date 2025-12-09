package week4;

abstract class ex05abs {
	int[] arr;
	int temp;
	void Uswap() {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	void print() {
		for(int n : arr) {
			System.out.printf("%d ", n);
		}
	}
}
public class ex05 extends ex05abs{
	
	public ex05() {
		arr = new int[] {10, 30, 25, 5, 50, 20};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex05 k = new ex05();
		
		k.Uswap();
		k.print();
	}

}
