package cap12;

interface FilmeA{
	public static final String filme = "De volta para o futuro I";
	public default void passarFilmeDeNovo() {System.out.println(filme+" esta sendo repetido");};}
interface FilmeB{
	public static final String filme = "De volta para o futuro II";
	public default void passarFilmeDeNovo() {System.out.println(filme+" esta sendo repetido");};}

public class Cinema implements FilmeA, FilmeB {
	
	@Override
	public void passarFilmeDeNovo() {
		System.out.println("Escolha o filme:");
	}
	
	public void repetirFilmeB() {FilmeB.super.passarFilmeDeNovo();}
	public void repetirFilmeA() {FilmeA.super.passarFilmeDeNovo();}
	
	public static void main(String[] args) {
		Cinema c = new Cinema();
//		System.out.println(filme);
		c.repetirFilmeB();
		c.repetirFilmeA();
	}
}
