package cap18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {
	private static int counter = 0;
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService service = null;
		
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(()-> {for (int i =0 ;i<5000;i++) counter++;});
			
			result.get(1, TimeUnit.NANOSECONDS);//throw the TimeOutException
			System.out.println("Reached");
		} catch (TimeoutException e) {
			System.out.println("Not reached in time!");
		}
		finally {
			if(service !=null) service.shutdown();
		}
		
	}
}
