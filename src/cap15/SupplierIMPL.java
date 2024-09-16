package cap15;

import java.util.function.Supplier;

public class SupplierIMPL {
	public static void main(String[] args) {
		Supplier<String> sup = () -> new String("Minha nova String");
		
		System.out.println(minhaString(() -> new String("Minha nova String")));
		System.out.println(minhaString(sup));
	}
	
	private static String minhaString(Supplier<String> sup) {
		return sup.get();
	}
}
