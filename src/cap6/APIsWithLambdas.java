package cap6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class APIsWithLambdas {
	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Cachorro", true, false));
		animals.add(new Animal("Gato", true, false));
		animals.add(new Animal("Águia", false, true));
		animals.add(new Animal("Peixe", true, false));
		animals.add(new Animal("Coiote", true, false));
		animals.add(new Animal("Cavalo", true, false));
		animals.add(new Animal("Chimpanze", true, false));
		
		Predicate<Animal> startsC = a -> !a.getName().toUpperCase().startsWith("C");
		Consumer<Animal> nomes = a -> System.out.println(a.getName());
		Comparator<Animal> organizar = (a,b) -> a.getName().compareTo(b.getName());
		
		animals.removeIf(startsC);
		animals.sort(organizar);
		animals.stream().forEach(nomes);
	}
}
