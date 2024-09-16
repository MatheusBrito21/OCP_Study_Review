package cap12;

public class LocalClass {
	private static int num = 3;

	public static void printNumber() {
		class LocalInner{
			int number = 5;
			
			public void print() {
				System.out.println(number);
				System.out.println(num*number);
			}
		}
		
		LocalInner li = new LocalInner();
		li.print();
	}
	
	public static void main(String[] args) {
		printNumber();
	}

}
