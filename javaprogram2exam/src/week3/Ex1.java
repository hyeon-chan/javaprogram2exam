package week3;

public class Ex1 {
	public void eSwap(int[] d) {
		int tmp;
		
		tmp = d[0];
		d[0] = d[1];
		d[1] = tmp;
		
		System.out.println("교체된 데이터1: x=" + d[0] + ", y= " + d[1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 k = new Ex1();
		int[] data;
		
		data = new int[] {10, 40, 50, 90, 100, 45, 76, 15, 3, 55};
		
		data[0] = 10;
		data[1] = 20;
		
		System.out.println("원본 데이터: x=" + data[0] + ", y=" + data[1]);
		
		k.eSwap(data);
		
		System.out.println("교체된 데이터2: x="+ data[0] + ", y=" + data[1]);
	}

}
