package week1;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		System.out.println("Singleton 객체 생성됨");
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
