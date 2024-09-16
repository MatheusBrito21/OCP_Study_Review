package cap18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockIMPL {
	private  AtomicInteger count = new AtomicInteger(0);
	private Lock locker = new ReentrantLock();
	private  void incrementCount() {
		try {
			locker.lock();
			System.out.print(count.incrementAndGet()+" ");
		} finally {
			locker.unlock();
		}
	}
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		try {
			LockIMPL l = new LockIMPL();
			for (int i = 0; i < 4; i++) {
				service.execute(()-> l.incrementCount());
			}
			
		} finally {
			if(service!=null)service.shutdown();
		}
		
		
	}
}
