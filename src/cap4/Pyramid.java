package cap4;

import java.util.ArrayList;
import java.util.List;

public class Pyramid {
	
	public static void main(String[] args) {
		String bloco = "@@";
		List<String> espacos = new ArrayList<>();
		StringBuilder degrau = new StringBuilder();
		
		//adiciona os espaços
		for (int i = 0; i <= 30; i++) {
			espacos.add("-");
		}
		
		for(int i = 0; i <=espacos.size() ;i++) {
			degrau.append(bloco);
			espacos.stream().forEach( e -> System.out.print(e));
//			System.out.print(i);
			System.out.println(degrau);
			espacos.remove(i);			
		}
	}
}
