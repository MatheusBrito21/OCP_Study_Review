package cap18;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteCLass {
	public static void main(String[] args) {
		
		Set<Character> chars = new CopyOnWriteArraySet<>(List.of('a','t'));
		List<String> lista = new CopyOnWriteArrayList<>(List.of("ola","mundo"));
		
		for(var l: lista) {
			System.out.print(l+" ");
			lista.add("hello");
		}
		System.out.println("\nSize:" +lista.size());
		System.out.println("nova lista:" +lista);
		
		for(var c: chars) {
			System.out.print(c+" ");
			chars.add('s');
		}
		System.out.println("\nSize:" +chars.size());
		System.out.println("novo set:" +chars);
	}
}
