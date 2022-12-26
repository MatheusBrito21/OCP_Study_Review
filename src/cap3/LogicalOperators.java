package cap3;

public class LogicalOperators {
	//  and -> & , or -> | , xor -> ^
	public static void main(String[] args) {
		boolean eyesClosed = true;
		boolean breathingSlowly = false;
		
		boolean resting = eyesClosed | breathingSlowly;
		boolean asleep = eyesClosed & breathingSlowly;
		boolean awake = eyesClosed ^ breathingSlowly;
		boolean dead = !awake;
		
		System.out.println("Resting = "+resting);
		System.out.println("Sleeping = "+asleep);
		System.out.println("Awake = "+awake);
		System.out.println("Dead = "+dead);
	}
}
