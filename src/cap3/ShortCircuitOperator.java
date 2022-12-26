package cap3;

public class ShortCircuitOperator {
	// and -> && , or -> ||
	public static void main(String[] args) {
		
		String nome = "Matt";
		String outroNome = new String();
		
		if(nome.length() >0 || outroNome != null ) {
			System.out.println("Do something...");
		}
	}
}
