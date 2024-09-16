package cap14;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {
		
		Map<Integer, String> trilogy = new TreeMap<>();
		trilogy.put(1, "De volta para o futuro I");
		trilogy.put(2, "De volta para o futuro II");
		trilogy.put(3, "De volta para o futuro III");
		
		System.out.println(trilogy);
		
		trilogy.put(1, "Alien");
		System.out.println(trilogy);
		
		var map = Map.of(1,2,3,6);
		var list = List.of(map.keySet());
		
		
		
//		Map m = new HashMap();
//		m.put(123, "m");
//		m.put("a", "m");
		
		
		System.out.println(list);
		
	}

}
