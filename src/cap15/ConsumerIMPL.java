package cap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerIMPL {
	public static void main(String[] args) {
		
		Consumer<Integer> n1 = x -> System.out.println(x);
		Consumer<Integer> n2 = x -> System.out.println(x+=10);
		Consumer<Integer> soma = n1.andThen(n2);
		
		soma.accept(5);
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		nums.forEach(n2);
		
		BiConsumer<StringBuilder, String> addString = StringBuilder::append;
		StringBuilder sb = new StringBuilder("Tony ");
		System.out.println(sb.toString());
		addString.accept(sb, "Stark");
		System.out.println(sb.toString());
		
	}
}
