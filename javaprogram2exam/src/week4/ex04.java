package week4;
import java.util.Scanner;

interface ex04inf {
	void input();
	void process();
	void print();
}
public class ex04 implements ex04inf{
	String Eng;
	int x, y, space;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("영문 문자열을 입력하세요: ");
		Eng = scanner.nextLine();
	}
	public void process() {
		for(int i=0; i<Eng.length(); i++) {
			char ch = Eng.charAt(i);
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || 
			ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || 
			ch == 'u') {
				x++;
			}else if(ch == ' ') {
				space++;
			}
		}
		y = Eng.length() - (x + space);
	}
	public void print() {
		System.out.printf("자음의 개수는 %d, 모음의 개수는 %d입니다.", y, x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex04 k = new ex04();
		k.input();
		k.process();
		k.print();
	}

}
