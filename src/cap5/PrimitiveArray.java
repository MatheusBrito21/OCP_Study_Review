package cap5;

import java.util.Arrays;

public class PrimitiveArray {
	public static void main(String[] args) {
		
		int [] numbers = new int[3];
		int numbersA[] = {0,50,2,5,13,97};
//		double [] numbersB = {};//length = 0, no elements
		
		Arrays.sort(numbersA);
		System.out.println("Array numbers : "+Arrays.toString(numbersA));
		System.out.println("binarySearch : "+Arrays.binarySearch(numbersA, 50));
		System.out.println("compare : "+Arrays.compare(numbersA, numbers));
		for(int n:numbersA) {
			System.out.print(n+" ");
		}
		

		
		
	
		
		
	}
}
