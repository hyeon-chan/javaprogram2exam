package week3;
import java.util.Scanner;

interface inf {
	void input();
	void process();
	void print();
}

public class Ex13 implements inf{
	int x, y, space;
	String S;
	
	public void input() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("영문 문자열을 입력하세요: ");
	S = scanner.nextLine();
	scanner.close();
	}
	
	public void process() {
		x=0;
		y=0;
		space = 0;
		for(int i=0; i<S.length(); i++) {
			char dt = S.charAt(i);
			
			if(dt == ' '){
					space++;
			}else if (dt == 'A' || dt == 'a' || dt == 'E' || dt == 'e' ||
                    dt == 'I' || dt == 'i' || dt == 'O' || dt == 'o' ||
                    dt == 'U' || dt == 'u') {
               y++;
			}
		}
		x = S.length() - y - space;
	}
	
	public void print() {
		System.out.printf("자음은 %d개, 모음은 %d개 입니다. ", x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex13 k = new Ex13();
		k.input();
		k.process();
		k.print();
	}

}
