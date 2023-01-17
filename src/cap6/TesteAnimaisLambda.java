package cap6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TesteAnimaisLambda {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cachorro", true, false));
		animals.add(new Animal("Gato", true, false));
		animals.add(new Animal("Águia", false, true));
		animals.add(new Animal("Pato", true, true));
		
		
		Predicate<Animal> podeNadar = a -> a.isCanSwim();
//		Consumer<Animal> nomeAnimal = a -> System.out.println(a.getName());
		
		printTeste(animals,podeNadar);
		
	}
	
	static void printTeste(List<Animal> l , Predicate<Animal> p) {
		for(Animal animal: l ) {
			if(p.test(animal))System.out.println(animal);;
		}
	}
	
}
