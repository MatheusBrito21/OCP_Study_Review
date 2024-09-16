package cap12;

interface PeriodoDia{
	
	private static void saudacao(int a){
		if(a >= 0 && a<6) System.out.println("Boa Madrugada!");
		else if(a>=6 && a<12) System.out.println("Bom dia!"); 
		else if(a>=12 && a<18) System.out.println("Boa tarde!"); 
		else System.out.println("Boa Noite!"); 
	}
	
	static void dizerSaudacao(int hora) {saudacao(hora);}
}

public class DizerPeriodoDia implements PeriodoDia {
	public static void main(String[] args) {
		
		PeriodoDia.dizerSaudacao(19);
	}
}
