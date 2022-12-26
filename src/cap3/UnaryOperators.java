package cap3;

public class UnaryOperators {
	// a++ , a--, ++a, --a , +a , -a , !a, (type)a
	public static void main(String[] args) {
		int lion = 3;
		lion = lion -1;// --lion
		System.out.println(lion--);//prints 2, but the value is 1
		System.out.println(--lion);//0
		++lion;
		System.out.println(lion);//2
	}
}
