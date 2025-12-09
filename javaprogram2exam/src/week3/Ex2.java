package week3;

public class Ex2 {
	public void eArray(int[] dt) {
		for(int i=0; i<dt.length-1; i++) {
			for(int j=i+1; j<dt.length; j++) {
				int temp;
				if(dt[i] > dt[j]) {
					temp = dt[i];
					dt[i] = dt[j];
					dt[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 k = new Ex2();
		int[] data;
		
		data = new int[] {10, 40, 50, 90, 100, 45, 76, 15, 3, 55};
		
		System.out.print("기본 데티어: ");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i] + " ");
		System.out.println();
		
		System.out.print("for each 적용 데이터: ");
		for(int n:data)
			System.out.print(n + " ");
		System.out.println();
		
		k.eArray(data);
		
		System.out.print("오름차순 데이터: ");
		for(int n:data)
			System.out.print(n + " ");
		System.out.println();
	}

}
