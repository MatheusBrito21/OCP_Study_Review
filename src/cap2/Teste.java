package cap2;

public class Teste {
	String name = "Matheus";
	public static float num1;
	
	public Teste() {
		name = "Stuart";
		System.out.println("Hello, my name is:" + this.name);
	}
//	//static Initializer
//	static {
//		System.out.println("Instance Initializer 1");
//	}
//	
//	public static void main(String[] args) {
//		Teste teste = new Teste();
////		teste.name = "Matheus";
//		System.out.println(teste.name);
//		
//		{System.out.println("Hello method main");}
//	}
//	//static Initializer
//	{System.out.println("Instance Initializer 2");}
}
