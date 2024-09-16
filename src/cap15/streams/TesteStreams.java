package cap15.streams;

import java.util.stream.Stream;

public class TesteStreams {
	public static void main(String[] args) {
		
//		Stream<Integer> myStream = Stream.generate(()-> 5);
//		Stream<Integer> myFiniteStream1 = Stream.iterate(1, x-> x<20, y-> y+1);//(valor incial, predicate, acumulador)
		Stream<Integer> myFiniteStream2 = Stream.iterate(2, y-> y <= 20 , y-> y+2);//(valor incial, acumulador)
//		myStream.map(x-> x*2).findAny().ifPresent(System.out::println);
		myFiniteStream2.forEach(System.out::println);
		
	}
}
