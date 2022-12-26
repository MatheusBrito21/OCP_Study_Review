package cap3;

public class RelationalOperators {
	// < , <= , > , >= , instanceof
	
	public static void main(String[] args) {
		int a = 10 , b = 12;
		String name = "Matheus";
		String nullName = new String();
		
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println( name instanceof String);
		System.out.println( nullName instanceof String);
		System.out.println( nullName instanceof Object);
		
	}
}
