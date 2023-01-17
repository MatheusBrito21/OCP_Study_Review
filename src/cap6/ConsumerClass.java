package cap6;

import java.util.function.Consumer;

public class ConsumerClass {
	public static void main(String[] args) {
		
		Animal leao = new Animal("Leão", true, false);
		
		Consumer<Animal> nome = a -> System.out.println(a.getName());
		
		imprimeNome(leao, nome);
	}
	static void imprimeNome(Animal a, Consumer<Animal> consumer) {
		consumer.accept(a);
	}
	
	
}
