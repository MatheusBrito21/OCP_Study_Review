package cap14.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDucks {
	public static void main(String[] args) {
		
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Howard"));
		ducks.add(new Duck("Donald"));
		ducks.add(new Duck("Patolino"));
		
		Collections.sort(ducks);
		System.out.println(ducks);
		
		var d1 = new Duck("Howard");
		var d2 = new Duck("Donald");
		var d3 = new Duck("donald");
		var d4 = new Duck("DONALD");
		
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		System.out.println(d2.compareTo(d3));
		System.out.println(d3.compareTo(d3));
		System.out.println(d4.compareTo(d3));
		
		int a = 5, b= 5;
		System.out.println(Integer.compare(a, b));
	}
}
