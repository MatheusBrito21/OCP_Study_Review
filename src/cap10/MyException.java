package cap10;

public class MyException {
	    public static void main(String[] args) {
			boolean a = false;
	    	try {
	    		if(a==true)throw new NullPointerException("Teve um problema");
	    		System.out.println("Ocorreu tudo certo");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	    	finally {
	    		System.out.println("end...");
	    	}
	    	
		}   
}

