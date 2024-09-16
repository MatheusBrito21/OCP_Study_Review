package cap16;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Localization {
	public static void main(String[] args) {
		
		var br = NumberFormat.getInstance(Locale.GERMANY);
		
		System.out.println(br.format(25000.65));
		
		double money = 125793571.457;
		
		NumberFormat nf = new DecimalFormat("R$ ###,###,###.0");
		System.out.println(nf.format(money));
		
	}
}
