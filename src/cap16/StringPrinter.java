package cap16;

public class StringPrinter implements AutoCloseable {
	public String s;
	public StringPrinter(String s) {
		this.s = s;
	}
	public String getStringP() {
		return this.s;
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("I'm closed!");
	}
}
