package cap12;

interface PrintValue{
	void printValor(String s);
}

public class NestedClasses {
	
	private String hello = "Hello Up class";
	
	public class InnerClass implements PrintValue{
		String helloIn = "Hello inner class";
		
		public void printValor(String s) {
			System.out.println(s);
		}
		
	}
	
	public void callInner() {
		InnerClass inner = new InnerClass();
		inner.printValor(hello);
		inner.printValor(inner.helloIn);
	}
	
	public static void main(String[] args) {
		NestedClasses n = new NestedClasses();
		n.callInner();
	}

}
