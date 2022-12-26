package cap3;

public class EqualityOperators {
	// == -> igual a
	// != -> diferente de
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = a!=b;
		
		Object d = new Object();
		Object e = new Object();
		Object f = d;
		
		System.out.println(c);
		System.out.println(d==e);
		System.out.println(d==f); 
	}

}
