package cap14.comp;

public class Duck implements Comparable<Duck> {
	private String name;
	private int weight;
	
	public Duck(String name) {
		this.name = name;
	}
	public Duck(String name,int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public int getWeight() {return this.weight;}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	@Override
	public int compareTo(Duck o) {
		return name.compareTo(o.name);
	}
	
}
