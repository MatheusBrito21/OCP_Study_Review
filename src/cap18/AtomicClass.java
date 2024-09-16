package cap18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClass {
	private AtomicInteger sheepCount = new AtomicInteger(0);
	private void incrementCount() {
		synchronized (this) {
			System.out.print(sheepCount.incrementAndGet()+" ");
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(20);
			AtomicClass a = new AtomicClass();
			for (int i = 0; i < 10; i++) {
					service.submit(()-> a.incrementCount());
			}
		} finally {
			if(service!=null)service.shutdown();
		}
		
	}
}
