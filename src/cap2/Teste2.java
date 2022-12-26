package cap2;

public class Teste2 {
	
	Teste2 objeto;
	
	public void novoOb(Teste2 t) {
		System.out.println("Passando a referencia");
		this.objeto = t;
	}
	
	public static void main(String[] args) {
		Teste2 teste1 = new Teste2();
		Teste2 teste2 = new Teste2();
		System.out.println(teste1);
		
		teste1.novoOb(teste2);
		System.out.println(teste1.objeto);
		System.out.println(teste2);
	}
}
