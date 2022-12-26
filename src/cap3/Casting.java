package cap3;

public class Casting {
	public static void main(String[] args) {
		//all short values are converted to int when used in any arithmetic operation
		short a = 12;
		byte b = 5;
		
		var c = a*b; //c is Int
		
//		short d = a+b; does not compile 
		short d = (short)(a+b);//d is short
		
		System.out.println(c);
		System.out.println(d);
		
	}
}
