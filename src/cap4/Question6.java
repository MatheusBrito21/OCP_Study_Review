package cap4;

import java.util.Iterator;

@SuppressWarnings("unused")
public class Question6 {
	public static void main(String[] args) {
		
		int count = 0;
		
		BUNNY: for (int i = 0; i <=3; i++) {
			RABBIT: for (int j = 0; j < 3; j++) {
				if((i+j) % 2 == 0 ) {
					System.out.println(count);
					break;
				}
				count++;
			}
		}
		
		System.out.println(count);
	}
}
