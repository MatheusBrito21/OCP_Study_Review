package cap3;

public class BinaryOperators {
	// + , - , * , / , %
	public static void main(String[] args) {
		
		int a = 20;
		long b = 45;
		var c = a+b;//c is a Long
		
		short g = 5;//g will be converted to int
		float d = 10;
		double e = 25;
		var f = e*g/d;//f is a Double
		
		System.out.println(c);
		System.out.println(f);
		
		
	}
}
