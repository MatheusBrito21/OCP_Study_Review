package cap6;

import java.util.Comparator;
import java.util.function.Consumer;

public class ComparatorClass {
	public static void main(String[] args) {
		
		Comparator<Integer> nums = (a,b) -> a.compareTo(b);
		Consumer<Integer> imprimir = n -> System.out.println(n);
		
		imprimir.accept(numsCompare(nums, 10, 5));
		
	}
	static Integer numsCompare(Comparator<Integer> com, Integer a, Integer b) {
		return com.compare(a, b);
	}
}

