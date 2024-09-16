package cap8;

class Example{
	
	static String name;
	void setName(String q) {name=q;}
}

public class Teste extends Example {
	static String name;
	void setName(String w) {name=w;}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		final Teste t = new Teste();
		final Example e = t;
		
		t.name = "Matheus";
		e.name = "Leo";
		
		System.out.println(t.name+ ""+ e.name);
		
		e.setName("Ola");
		t.setName("Well");
		System.out.println(t.name+ ""+ e.name);
		
	}
}
