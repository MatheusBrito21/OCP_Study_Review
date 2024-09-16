package cap18;

public class Test1 {
	public static void main(String[] args) {
		
		System.out.println("begin");
		(new Thread(new PrintData())).start();
		new Message().start();
		System.out.println("end");
		new Message().start();
		
	}
}
