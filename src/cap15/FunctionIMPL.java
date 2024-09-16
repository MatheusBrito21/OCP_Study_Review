package cap15;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionIMPL {
	public static void main(String[] args) {
		
		Function<Integer,Integer> quadradoInt = x-> x*x;
		Function<Integer,Double> metade = x -> (double)x/2;
		Function<Integer, Double> multDiv= quadradoInt.andThen(metade);
		
		System.out.println(quadradoInt.apply(10));
		System.out.println(metade.apply(15));
		System.out.println(multDiv.apply(5));
		
		BiFunction<Integer, String, Integer> soma = (n,s) -> n+ s.length();
		System.out.println(soma.apply(1, "º String"));
	}
}
