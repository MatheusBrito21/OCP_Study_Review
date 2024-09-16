package cap14;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		
		//Queue<> -> Fila = FIFO
		Queue<String> livros = new LinkedList<>();
		
		System.out.println(livros.add("O Iluminado"));//adiciona elemento e retorna true ou lança exception
		System.out.println(livros.element());//retorna o proximo elemento ou lança exception
		
		System.out.println(livros.offer("Jogador N 1"));//adiciona no fim da fila e retorna boolean
		System.out.println(livros.element());
		
		System.out.println(livros.remove());//retorna e remove o proximo elemento ou lança exception
		System.out.println(livros.element());
		System.out.println(livros.peek());//retorna o proximo elemento ou null
		System.out.println(livros.poll());//retorna e remove o proximo elemento ou null
		System.out.println(livros.poll());
		
	}
}
