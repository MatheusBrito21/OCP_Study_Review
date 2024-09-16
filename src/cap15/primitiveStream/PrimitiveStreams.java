package cap15.primitiveStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		
		IntStream primInt = IntStream.of(1,2,3);
		System.out.println(primInt.max().getAsInt());

		System.out.println("Total Stream:"+ IntStream.range(0, 10).sum());
		
		var randoms = DoubleStream.generate(Math::random);
		var fractions = DoubleStream.iterate(.5, f-> f/2);
		fractions.limit(3).forEach(System.out::println);
		randoms.limit(5).map(x-> x*100).forEach(System.out::println);
		
	}
}
