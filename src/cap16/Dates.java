package cap16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates {
	public static void main(String[] args) {
		
		var dt = LocalDate.now();
		var f = dt.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		
		System.out.println(dt);
		System.out.println(f);
		
	}
}
