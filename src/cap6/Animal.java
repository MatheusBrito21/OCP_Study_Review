package cap6;

public class Animal {
	private String name;
	private boolean canSwim;
	private boolean canFly;
	public Animal(String name, boolean canSwim, boolean canFly) {
		super();
		this.name = name;
		this.canSwim = canSwim;
		this.canFly = canFly;
	}
//	public String toString() {
//		return String.format("Nome: %s \nNada:%s \nVoa:%b\n",this.name,this.canSwim,this.canFly);
//	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isCanSwim() {
		return canSwim;
	}
	
	public boolean isCanFly() {
		return canFly;
	}
	
}
