package cap14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferences {	
	
	public static void main(String[] args) {
		//Constructor
		System.out.println("Calling Constructor-----");
		Supplier<List<Integer>> nums = ArrayList::new;
		List<Integer> listaNums = nums.get();
		listaNums.addAll(Arrays.asList(3,9,15,8,26));
		
		listaNums.stream().forEach(System.out::println);
		
		System.out.println("Calling static methods-----");
		Consumer<List<Integer>> listaOrdenada = Collections::sort;
		listaOrdenada.accept(listaNums);
		listaNums.stream().forEach(System.out::println);
		
		System.out.println("Calling Instance methods-----");
		
		var abc = "abc";
		Predicate<String> methodRef = abc::startsWith;
		Predicate<String> lambda = s -> abc.startsWith(s);
		
		if(methodRef.test("a"))System.out.println(true);
		else System.out.println(false);
		
		if(lambda.test("n"))System.out.println(true);
		else System.out.println(false);
	}

}
