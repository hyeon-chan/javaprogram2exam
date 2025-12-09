package week4;
import java.util.Scanner;

class ex03ex {
	double a, b, c, d, e, sum, avg;
	String grade;
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("5개의 실수형 점수를 입력하세요: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		scanner.close();
	}
	void process() {
		sum = a+b+c+d+e;
		avg = sum/5;
		
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else grade = "F";
			
	}
	void print() {
		System.out.printf("총합은 %.2f이고, 학점은 %s입니다.", sum, grade);
	}
}
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex03ex k = new ex03ex();
		k.input();
		k.process();
		k.print();
	}

}
