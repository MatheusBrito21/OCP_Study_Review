package cap18;

public class PrintData implements Runnable{
	@Override
	public void run() {
		for(int i =1; i<=5;i++) {
		
			System.out.println("Counting: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Finish!");
	}
	
	public static void main(String[] args) throws InterruptedException {
		(new Thread(new PrintData())).start();
	}
}
