package cap6;

import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cachorro", true, false));
		animals.add(new Animal("Gato", true, false));
		animals.add(new Animal("Águia", false, true));
		animals.add(new Animal("Pato", true, true));
		
		
//		Predicate<Animal> podeNadar = a -> a.isCanSwim();
		
		printTeste(animals, new TestaHabilidade());
		
	}
	
	static void printTeste(List<Animal> l , TestaHabilidade t) {
		System.out.println("Animais que voam:");
		for(Animal animal: l ) {
			if(t.podeVoar(animal))System.out.println(animal.getName());
		}
	}
	
}
