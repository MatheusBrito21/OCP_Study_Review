package cap9;

public class Pessoinha extends Pessoa {
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getIdade() {
		return this.idade;
	}
	
	static void print() {
		System.out.println("Something static 2...");
	}
	
	public static void main(String[] args) {
		
		Pessoa p = new Pessoinha();
		p.setName("Matt");
		p.setIdade(25);
		p.printName();
		System.out.println(p.getIdade());
		Pessoa.print();
		print();
		
		
	}

}
