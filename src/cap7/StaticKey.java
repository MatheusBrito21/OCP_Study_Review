package cap7;

public class StaticKey {
	static int count = 1;
	int plus = 0;
	
	static{count++;}
	
	public static void counter() {
		count++;
		new StaticKey().plus++;
	}
	
	public static void main(String[] args) {
		
		StaticKey sk = new StaticKey();
		counter();
		System.out.println(count++);
		System.out.println(sk.plus);
		sk=null;
		System.out.println(count++);
		counter();
		System.out.println(count);
		
	}
}
