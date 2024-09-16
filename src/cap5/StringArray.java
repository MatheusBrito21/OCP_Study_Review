package cap5;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		
		String [] nullArray = new String[3];//[null,null,null]
		String nomes[] = {"Marty","Emmet","Jeniffer"};
		String nomes2[] = nomes;
		Arrays.sort(nomes);
		System.out.println(Arrays.toString(nullArray));
		System.out.println(Arrays.binarySearch(nomes, "a"));
		System.out.println(Arrays.toString(nomes));
		System.out.println(Arrays.compare(nomes, nomes2));
		for (int i = 0; i < nomes2.length; i++) {
			System.out.println(nomes2[i].contains("m"));
		}
		
		System.out.println(nomes == nomes2);
	}
}
