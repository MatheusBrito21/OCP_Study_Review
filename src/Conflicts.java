import java.time.Instant;
import java.util.Date;
//import java.sql.Date; //torna a referencia de Date ambígua

public class Conflicts {

	public static void main(String[] args) {
		Date date = Date.from(Instant.now());
		System.out.println(date);
	}

}
