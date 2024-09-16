package cap15.advancedStreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Group {
	public static void main(String[] args) {
		
		Stream<String> str = Stream.of("Matt","Leo","Well","Sandra","L");
		
		Map<Integer, List<String>> lista = str.collect(Collectors.groupingBy(String::length));
		
		lista.forEach((x,y) -> System.out.println(x + " "+y));
	}
}
