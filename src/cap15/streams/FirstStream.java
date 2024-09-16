package cap15.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStream {
	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> fromVargs = Stream.of(1,2,3);
		
		
		System.out.println(empty.count());
		List<Integer> newList = fromVargs.map(x-> x*2).collect(Collectors.toList());
		System.out.println(newList);
		
//		Stream<Integer> infiteStream1 = Stream.generate(()-> 5);
//		Stream<Integer> infiteStream2 = Stream.iterate(1, x-> x+2).limit(100);
		Stream<Integer> infiteStream3 = Stream.iterate(1, i-> i!=50, x-> x+1).limit(100);
		infiteStream3.forEach(x-> System.out.println(x));
	}
}
