package cap15.primitiveStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestMethods {
	public static void main(String[] args) {
		
		var box = LongStream.of(6L,8L,10L )
				.mapToInt(x -> (int)x)
				.boxed()
				.collect(Collectors.groupingBy(x-> x))
				.keySet()
				.stream()
				.collect(Collectors.averagingInt(x->x));//create a Stream of Integers
		System.out.println(box);
		
		var boxLongs = LongStream.of(6L,8L,10L)
				.boxed()
				.collect(Collectors.averagingLong(x->x));//create a Stream of Integers
		System.out.println(boxLongs);
		
		List<Integer> x1 = List.of(1,2,3);		
		List<String> x2 = List.of("4","number 5","6");
		List<Double> x3 = List.of(2.5, 9.6);
		
		Stream<String> s = Stream.of(x1,x2,x3).flatMap(x -> x.stream().limit(1)).map(x-> "You're String now " + x);
		s.forEach(System.out::println);
		
		
		
		
		
	}
}
