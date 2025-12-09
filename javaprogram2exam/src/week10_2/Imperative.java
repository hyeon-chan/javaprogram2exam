package week10_2;
import java.util.*;

public class Imperative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(12, 3, 16, 2, 1, 9, 7, 20);
		List<Integer> even = new ArrayList<>();
		
		for (Integer e : list) {
			if(e%2 == 0)
				even.add(e);
		}
		for(Integer e:even) {
			System.out.println(e);
		}
	}

}
