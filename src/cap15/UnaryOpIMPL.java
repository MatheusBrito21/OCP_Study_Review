package cap15;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOpIMPL {
	public static void main(String[] args) {
		
		String m = new String("Mario");
		String l = new String("Luigi");
		
		UnaryOperator<String> smb = s -> ("Super "+s+" Bros").toUpperCase();
		System.out.println(smb.apply(m));
		
		BinaryOperator<String> b = (s1,s2)-> (s1+" and "+s2+" adventures").toUpperCase();
		System.out.println(b.apply(m, l));
		
		System.out.println(b.apply("Link", "Zelda"));
	}
}
