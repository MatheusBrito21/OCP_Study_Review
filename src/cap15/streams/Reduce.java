package cap15.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {
	public static void main(String[] args) {
		
		Stream<Integer> nums = Stream.of(1,2,3,4,5);
		int soma = nums.reduce(0,(t,f) -> t+f);
		System.out.println(soma);
		
		List<String> letras = new ArrayList<>(Arrays.asList("a","b","c"));
		letras.add("d");
		letras.add("e");
		
		String abc = letras.stream().reduce("", (s1,s2) -> s1+s2, (a,b)-> a+b);
		String abc2 = letras.stream().reduce("", (a,b)-> a+b);
		System.out.println(abc);
		System.out.println(abc2);
		
	}
}
