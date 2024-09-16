package cap12;

public enum WeekDays {
	
	MONDAY(1),THUESDAY(2),WEDNESDAY(3);
	private final int dia;

	private WeekDays(int dia) {
		this.dia = dia;
	}
	
	public void printDay() {
		System.out.println(dia);
	}
	
	
}
