package cap16;

public class ExMain {
	public static void main(String[] args) throws MyException {

		try(var s = new StringPrinter("I'm open!")) {
			System.out.println("Try block: " + s.getStringP());
			throw new MyException("Something went wrong!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
