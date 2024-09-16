package cap18;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedFixed {
	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		try {
			service.scheduleAtFixedRate(
					()-> System.out.println("Running1 "+ LocalTime.now().getSecond()), 1, 3, TimeUnit.SECONDS);
			service.scheduleAtFixedRate(
					()-> System.out.println("Running2 "+ LocalTime.now().getSecond()), 2, 5, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
