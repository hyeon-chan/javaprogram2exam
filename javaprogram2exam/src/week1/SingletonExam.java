package week1;

class Calculator {
	enum Day{MON, TUE, WED, THU, FRI};
	Day day;
	private static Calculator cal;
	
	private Calculator() {
		day=Day.MON;
	}
	public static Calculator getInstance() {
		if (cal == null)
			cal=new Calculator();
		return cal;
	}
}
public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = Calculator.getInstance();
		System.out.println("Day= " + cal.day);
	}

}
