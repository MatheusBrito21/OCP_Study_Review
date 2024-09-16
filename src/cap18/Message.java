package cap18;

public class Message extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("Showing message!");
	}
	
	public static void main(String[] args) {
		new Message().start();
	}
}
