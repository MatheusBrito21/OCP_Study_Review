package cap18;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor {
	public static void main(String[] args)  {
		
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Runnable task = ()-> System.out.println("Socorro!!!");
		
		try {
			
			for (int i = 0; i < 5; i++) {
				service.execute(task);
				Thread.sleep(1000);
			}
			Future<?> f = service.submit(() -> "Olha..um buraco");
			System.out.println(f.get());
			
		} catch(InterruptedException |ExecutionException e){
			
		}finally {
			System.out.println("Morri...");
			if(service!=null)service.shutdown();
		}
		
	}
}
