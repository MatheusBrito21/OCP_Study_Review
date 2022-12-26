package cap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	public static void main(String[] args) {
		int killCount = 13;
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Mathew");
		nomes.add("Foggy");
		nomes.add("Karen");
		
		
		System.out.println(nomes.toString());
		
		nomes.remove(2);
		System.out.println(nomes.toString());
		
		nomes.set(1, "Frank");
		System.out.println(nomes.toString());
		
		nomes.add(0, "elektra");
		System.out.println(nomes.toString());

		System.out.println(nomes.contains("Mathew"));
		
		nomes.add(Integer.toString(killCount));
		System.out.println(nomes.toString());
		
		Collections.sort(nomes);
		System.out.println("Sorted:"+nomes.toString());//order: numbers,UPPERCASE,lowercase(alphabetic)
		
		nomes.clear();
		System.out.println(nomes.size() + " " + nomes.isEmpty());
	}
}
