package week3;
import java.util.Scanner;

class Exam {
	double a, b, c, d, e, sum, avg;
	String grade;
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 5개를 입력하세요: ");
		a = scanner.nextDouble();	
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		scanner.close();
	}
	
	void progress() {
		sum = a+b+c+d+e;
		avg = sum/5.0;
		
		if(avg>=90) grade = "A";
		else if(avg>=80) grade = "B";
		else if(avg>=70) grade = "C";
		else grade = "F";
	}
	
	void print() {
		System.out.println("학점은 :" + grade);
	}
}

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam k = new Exam();
		k.input();
		k.progress();
		k.print();
	}

}
