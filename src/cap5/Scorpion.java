package cap5;

class Aracnideo{
	static StringBuilder sb = new StringBuilder();
			{sb.append("c");}
	static {sb.append("u");}
	 		{sb.append("r");}
}

public class Scorpion extends Aracnideo {
	static {sb.append("q");}
			{sb.append("m");}
			
			public static void main(String[] args) {
				System.out.println(Scorpion.sb);
				System.out.println(Scorpion.sb);
				new Aracnideo();
				new Scorpion();
				System.out.println(Scorpion.sb);
				
				
			}
	
	
}
