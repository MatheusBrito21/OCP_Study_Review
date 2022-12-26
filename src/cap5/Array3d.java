package cap5;

public class Array3d {
	public static void main(String[] args) {
		
		int [][] sequence = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < sequence.length; i++) {
			for (int j = 0; j < sequence[i].length; j++) {
				System.out.print(sequence[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
