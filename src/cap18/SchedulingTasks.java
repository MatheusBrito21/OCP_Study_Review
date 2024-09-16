package cap18;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulingTasks {
	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Callable<String> cTask = () -> "Calling...";
		Runnable rTask = () -> System.out.println("Running...");
		
		
		ScheduledFuture<?> sf1 = service.schedule(rTask, 5, TimeUnit.SECONDS);
		ScheduledFuture<?> sf2 = service.schedule(cTask, 3, TimeUnit.SECONDS);
		
		try {
			System.out.println(sf2.get());
			sf1.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			if(service!=null) service.shutdown();
		}
	}
}
