package cap1;

import java.util.stream.Stream;

public class Testes {
	public static void main(String[] args) {
		
		var stream = Stream.iterate(1 , i-> i);
		stream.forEach(System.out::print);
	}
	
}
