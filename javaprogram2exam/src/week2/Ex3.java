package week2;
import java.util.Scanner;
public class Ex3 {
	int x, y, z, sum;
	String grade;
	double avg;
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("세 개의 점수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		scanner.close();
	}
	
	void process() {
		sum = x + y + z;
		avg = sum/3;
		
		if(avg>=90)
			grade = "A";
		else if(avg>=80)
			grade = "B";
		else if(avg>70)
			grade = "C";
		else
			grade = "F";
	}

	void print() {
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + grade);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3 k = new Ex3();
		k.input();
		k.process();
		k.print();
	}

}