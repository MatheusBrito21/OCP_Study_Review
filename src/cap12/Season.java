package cap12;

public enum Season {
	
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
	private final String expectedVisitors;
	
	private Season(String ex) {
		this.expectedVisitors = ex;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
	
	public String toString() {
		return this.expectedVisitors;
	}

}
