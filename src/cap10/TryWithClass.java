package cap10;

public class TryWithClass {
	public static void main(String[] args) {
		
		try(var r = new MyCloseableClass("Mall"); var q = new MyCloseableClass("Store")){
			
			System.out.println("Something happaned...");
			throw new RuntimeException("Something went wrong");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			}
		finally {System.out.println("We are done!");}
		
	}
}
