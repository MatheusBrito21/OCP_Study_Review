package cap2;

public class Pessoa {
	double altura;
	int idade;
	String nome;
	double peso;
	double distanciaPercorrida=0;
	
	public void distanciaPerc(double correu) {
		var p = this.distanciaPercorrida+ correu;
		this.distanciaPercorrida = p;
		System.out.println("A pessoa correu "+p+"m");
	}
	
	public double comer(double pesoComida) {
		var p = peso + pesoComida;
		
		return p;
	}
	public double comer() {
		var p = peso + 1;
		return p;
	}
	
	public void resetPeso() {
		this.peso = 0;
	}
	public void setPeso(double p) {
		this.peso = p;
	}
}
