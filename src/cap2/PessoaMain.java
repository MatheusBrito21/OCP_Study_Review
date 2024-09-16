package cap2;

public class PessoaMain {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		Pessoa p2 = new Pessoa();
		p2.setPeso(55);
		System.out.println(p2.peso);
		p2.comer();//56
		System.out.println(p2.peso);//55
		
		
		p1.peso= 90;
		System.out.println("Peso atual- "+p1.peso);
		System.out.println("Novo Peso- "+p1.comer(3));
	
	}
}
