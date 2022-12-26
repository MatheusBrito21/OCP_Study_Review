package cap5;

public class SBuilder {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append(" World");
		sb.insert(sb.length(), "!!!");
		sb.replace(5, 6, ",");
		System.out.println(sb.toString());
		StringBuilder sb2 = sb.append("Java 11");
		
		String a = new String("abc");
		String b = new String("abc");
		
		
		System.out.println(sb2.toString());
		System.out.println(sb == sb2);
		System.out.println(a == b);// diferent objects
		System.out.println(a.equals(b));
		
	}
}
