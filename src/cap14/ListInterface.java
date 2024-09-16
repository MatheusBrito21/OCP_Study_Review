package cap14;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Tony");
		nomes.add("Steve");
		nomes.add("Bruce");
		System.out.println(nomes);
		
		nomes.remove(0);
		System.out.println(nomes.get(0));
		nomes.removeIf(s->s.endsWith("e"));
		System.out.println(nomes.isEmpty());
	}
}
