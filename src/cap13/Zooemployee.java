package cap13;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Exercise(hoursPerDay = 3, startHour = 8) public class Zooemployee {
	
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> pares = (Integer p) -> {return p%2==0;};
		
		List<Integer>listaPares = lista.stream().filter(pares).collect(Collectors.toList());
		System.out.println(listaPares);
		
		
	}

}
