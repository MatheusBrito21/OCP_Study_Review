package cap15;

import java.util.Optional;

public class OptionalType {
	static Optional<Double> pontos(double... ponto){
		
		if(ponto.length == 0) return Optional.empty();
		
		double total=0;
		for(double n: ponto) {
			total+=n;
		}
		return Optional.of(total);
	}
	
	static void printPontuacao(Optional<Double> opd ) {
		System.out.println(opd.orElseGet(()-> 1.0));
	}
	
	public static void main(String[] args) {
		Optional<Double> result = pontos(2.3,5.5);
		Optional<Double> op = pontos();
		Optional<Double> opd = pontos();
		System.out.println(result.orElseThrow());
		System.out.println(op.orElse(Math.PI));
		System.out.println(op.orElseGet(() ->  Math.random()));
		System.out.println(op.isEmpty());
		printPontuacao(opd);
		System.out.println(op.orElseThrow(() -> new RuntimeException("Vazio")));
	}
}
