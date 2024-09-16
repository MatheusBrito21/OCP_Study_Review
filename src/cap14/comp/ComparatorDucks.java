package cap14.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDucks {
	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Howard", 10));
		ducks.add(new Duck("Donald", 20));
		ducks.add(new Duck("Patolino", 8));
		
		Collections.sort(ducks);
		System.out.println("Sorted by name "+ducks);
		
//		Comparator<Duck>byWeight = (d1,d2) -> d2.getWeight() - d1.getWeight();
//		Comparator<Duck>c2 = Comparator.naturalOrder();
//		Comparator<Duck>c3 = Comparator.reverseOrder();
		
		Collections.sort(ducks, (d1,d2) -> d2.getWeight() - d1.getWeight());
		System.out.println("Sorted by weight "+ducks);
		
		System.out.println(ducks.get(0));
		
	}
}	
