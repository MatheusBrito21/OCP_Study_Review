package cap10;

public class MyCloseableClass implements AutoCloseable{
	
	private String resource;
	
	public MyCloseableClass(String r) {
		this.resource = r;
	}
	
	@Override
	public void close(){
		System.out.println(this.resource +" is closed.");
	}
}
