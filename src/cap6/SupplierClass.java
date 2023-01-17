package cap6;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierClass {
	public static void main(String[] args) {
		
//		Supplier<Integer> number = () -> 42;
		Supplier<Integer> randomNumer = () -> new Random().nextInt(128);
	
		for (int i = 0; i < 128; i++) {
			System.out.println(returnNum(randomNumer));			
		}
		
	}
	
	static Integer returnNum(Supplier<Integer> s) {
		return s.get();
	}
}
