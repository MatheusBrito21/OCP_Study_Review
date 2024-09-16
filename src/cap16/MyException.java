package cap16;

public class MyException extends Exception {
	private static final long serialVersionUID = 1L;
	private String message;
	
	public MyException(String message) {
		this.message =message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
