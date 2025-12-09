package problem;
import java.util.Scanner;

class ex01ex {
	int num;
	int sum = 0;
	double avg;
	int count;
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100 정수를 입력하세요: ");
		num = scanner.nextInt();
	}
	void process() {
		for(int i=1; i<100; i++) {
			if((num*i)>100) break;
			System.out.print(num*i + " ");
			sum += (num*i);
			count++;
			avg = (double)sum/count;
		}
	}
	void print() {
		System.out.printf("\n배수의 합은 %d이고, 평균은 %.2f입니다.", sum, avg);
	}
}
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex01ex k = new ex01ex();
		k.input();
		k.process();
		k.print();
	}

}
