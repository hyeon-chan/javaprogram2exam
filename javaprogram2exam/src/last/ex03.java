package last;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double[] data = {90, 78.5, 100, 56.9, 70, 56.3, 80, 50.5};
		double[] copy = new double[data.length];
		int x;
		for(int i=0; i<data.length; i++) {
			copy[i] = data[i];
		}
		do {
			System.out.print("1)오름차순으로 정렬하여 출력\n 2)내림차순으로 정렬하여 출력\n 3)원본 출력\n 4)프로그램 종료\n 번호를 선택하세요 ");
			x = scanner.nextInt();
			switch(x) {
			case 1 :
				System.out.print("오름차순으로 정렬한 데이터: ");
				for(int i=0; i<data.length; i++) {
					for(int j=0; j<data.length; j++) {
						if(data[i]>data[j]) {
							double temp;
							temp = data[i];
							data[i] = data[j];
							data[j] = temp;
						}
					}
				}
				break;
			case 2 :
				System.out.print("내림차순으로 정렬한 데이터: ");
				for(int i=0; i<data.length; i++) {
					for(int j=0; j<data.length; j++) {
						if(data[i]<data[j]) {
							double temp;
							temp = data[i];
							data[i] = data[j];
							data[j] = temp;
						}
					}
				}
				
				break;
			case 3:
				System.out.print("원본 데이터: ");
				data = copy;
				for(double d:data) {
					System.out.print(d +" ");
				}
				
			}
		} while(x!=4);
		System.out.print("시스템을 종료합니다. ");
	}
	}
