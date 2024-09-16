package cap15.primitiveStream;

import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;

public class PrimitiveInterfaces {
	public static void main(String[] args) {
		
		DoublePredicate dp = (x)-> x>5;
		DoubleFunction<String> ds = (x)-> String.valueOf(x);
		
		boolean p = dp.test(5.5);
		String d = ds.apply(2.5);
		System.out.println(p+" "+d);
	}
}
