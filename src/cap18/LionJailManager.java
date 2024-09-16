package cap18;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionJailManager {
	private void removeLions() {System.out.println("Removing Lions");}
	private void cleanJail() {System.out.println("Cleaning...");}
	private void addLions() {System.out.println("Adding Lions");}
	public void performTasks(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			removeLions();
			c1.await();
			cleanJail();
			c2.await();
			addLions();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(6);
			var manager = new LionJailManager();
			var c1 = new CyclicBarrier(4);
			var c2 = new CyclicBarrier(4,()-> System.out.println("All cleaned!!!".toUpperCase()));
			
			for (int i = 0; i < 4; i++) {
				service.submit(()-> manager.performTasks(c1,c2));
			}
		} finally {
			if(service!=null) service.shutdown();
		}
		
	}

}
