package cap8;

class Fish{
	static {System.out.print("A");}
	{System.out.print("B");}
	
	public Fish(String name) {
		this(1);
		System.out.print("C");
	}
	public Fish() {
		System.out.print("D");
	}
	public Fish(int stripes) {
		System.out.print("E");
	}
}

public class Nemo extends Fish {
	static {System.out.print("F");}
	
	public Nemo(int stripes) {
		super("Nemo");
		System.out.print("G");
	}
	
	
	{System.out.print("H");}
	
	public static void main(String[] args) {
//		new Nemo(1);
//		System.out.println();
//		new Nemo(2);
	}
}
