package cap9;

public abstract class Pessoa {
	String name;
	int idade;
	protected abstract String getName(); 
	abstract int getIdade();
	static void print() {
		System.out.println("Something static 1...");
	}
	
	void setName(String name) {this.name = name;}; 
	void setIdade(int idade) {this.idade = idade;}; 
	
	void printName() {
		System.out.println(getName());
	};
}
