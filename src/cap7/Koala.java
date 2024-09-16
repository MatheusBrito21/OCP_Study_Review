package cap7;

public class Koala {
	public static int count = 0;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println(count);
		
		Koala k1 = new Koala();
		Koala k2 = new Koala();
		
		k1.count = 1;
		System.out.println(k1.count);
		
		k2.count = 2;
		System.out.println(k2.count);
		
		System.out.println(count);
	}
}
