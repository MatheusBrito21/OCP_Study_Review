package cap15;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicateimpl {
	public static void main(String[] args) {
		
		String empty = "";
		String empty2 = "   ";
		
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isBlank = String::isBlank;
		
		System.out.println(isEmpty.test(empty));
		System.out.println(isBlank.test(empty2));
		
		BiPredicate<String, String> contem = String::contains;//(s1,s2) -> s1.contains(s2);
		System.out.println(contem.test("Ola", "u"));
		
	}
}	
