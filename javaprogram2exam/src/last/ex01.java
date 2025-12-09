package last;
import java.util.Scanner;

interface exinf {
	void input();
	void process();
	void print();
}

class ex01ex implements exinf{
	String res;
	int x;
	Scanner scanner = new Scanner(System.in);
	public void input() {
		System.out.print("숫자 입력: ");
		x = scanner.nextInt();
		scanner.close();
	}
	public void process() {
		if(x>=45 && x<=75)
			res = "통과";
		else if(x>=30 && x<=44)
			res = "보류";
		else if(x>=76 && x<=90)
			res = "보류";
		else
			res = "불발";
	}
	public void print() {
		System.out.printf("해당 숫자의 결과는 %s입니다, ", res);
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
