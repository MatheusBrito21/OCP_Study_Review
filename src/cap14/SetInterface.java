package cap14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetInterface {
	public static void main(String[] args) {
		Set<Integer> setNums = new HashSet<>(Arrays.asList(1,3,9,25,0));
		
		setNums.add(5);
		setNums.add(5);
		System.out.println(setNums.isEmpty());
		
		Set<String> setNomes = new TreeSet<>();
		setNomes.add("Matheus");
		setNomes.add("Leo");
		setNomes.add("Well");
		
		System.out.println(setNomes);
		
		List<String>nomes =  setNomes.stream().map(x -> x+=" B").collect(Collectors.toList());
		System.out.println(nomes);
		
		
	}
}
