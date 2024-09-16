package cap12;

interface Walks{ public default int getSpeed() {return 5;}}
interface Runs{public default int getSpeed() {return 10;}}

public class Cat implements Walks, Runs {
	public int getSpeed() {
		return 20;
	}
	
	public int getWalkSpeed() {
		return Walks.super.getSpeed();
	}
	public static void main(String[] args) {
		Cat a = new Cat();
		System.out.println(a.getSpeed());
		System.out.println(a.getWalkSpeed());
	}
}
