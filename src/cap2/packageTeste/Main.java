package cap2.packageTeste;

import cap2.packageTeste.classes.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Matheus");
		p.setIdade(24);
		
		System.out.println(p);
	}

}
