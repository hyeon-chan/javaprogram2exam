package week10;

public class DataBaseEx1 {
	private String name;
	private int x;
	private int y;
	
	public DataBaseEx1(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void print() {
		System.out.printf("이름은 %s이고, 점수는 %d, %d입니다.", name, x, y);
	}
	
	public static void main(String[] args) {
		new DataBaseEx1("홍길동", 100, 97).print();
	}
}
