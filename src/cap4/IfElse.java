package cap4;

public class IfElse {
	public static void main(String[] args) {
		
		boolean rainning = true;
		boolean useUmbrella = false;
		
		if(rainning == true) {
			useUmbrella = true;
			System.out.println("Est� chovendo.");
			System.out.println("Usar guarda chuva? " + useUmbrella);
		}else {
			useUmbrella = false;
			System.out.println("N�o est� chovendo");
			System.out.println("Usar guarda chuva? " + useUmbrella);

		}
		
	}
}
