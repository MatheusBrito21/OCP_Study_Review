package cap15.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
		
		Stream<Integer> nums2 = Stream.iterate(11, n-> n<=20, x->x+1);
		Stream<Integer> nums = Stream.iterate(0, n-> n<=10, x->x+1);
//		nums
//		.filter(x-> x%2==0)
//		.peek(System.out::println)
//		.limit(2)
//		.forEach(System.out::println);
		
		Stream<String> food = Stream.of("Macarrao", "Lasanha","Hamburguer","Pizza");
		food.sorted((s1,s2)-> s1.length() - s2.length()).forEach(System.out::println);
						//Comparator.reversedOrder();
		
		Stream<List<Integer>> listas = Stream.of(nums.collect(Collectors.toList()),nums2.collect(Collectors.toList()));
		listas.flatMap(m-> m.stream()).forEach(System.out::println);
	}

}
