package cap2;

public class Review {
	
	static String a = "Hello";
	static int countObjects=0;
	int c  = 10;
	
	static {System.out.println("Iniciando");}
	{ countObjects++; System.out.println(a + " Object-> "+countObjects);}
	
	public static void main(String[] args) {
		
		new Review();
		new Review();
		new Review();
		
		var object = new Review();
		System.out.println(object.c+20+" var"+ (object.c+40));
		
		System.out.println(a);
	}
}
