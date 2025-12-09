package week2;

public class Ex1 {
	String name;
	int score;
	
	void input(String[] args) {
		name = args[0];
		score = Integer.parseInt(args[1]);
	}
	
	void print() {
		System.out.println("입력하신 데이터는 " + name + ", " + score +"입니다. ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1 ex1 = new Ex1();
		ex1.input(args);
		ex1.print();
	}

}
