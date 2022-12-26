package cap2;

public class Instances {
	
	static String a = "Class Variable";
	String b = "Instance Variable";
	String c;
	int d;
	
	public static void main(String[] args) {
		Instances i = new Instances();
		
		System.out.println(Instances.a);
		System.out.println(i.b);
		System.out.println(i.c);
		System.out.println(i.d);
	}

}
