package cap5;

public class StringAPI {
		
	public static void main(String[] args) {
		
		String str = new String("Lampada");
		String trimS = "  Ola ";
		char letra = str.charAt(2);
		int achar = str.indexOf(letra);//retorna o indice
		int acharStr = str.indexOf("am");
		int acharP = str.indexOf("a",2);
		String sub = str.substring(1, 6);
		String rep = str.replace("a", "A");
		
		System.out.println("length = "+ str.length());
		System.out.println("charAt = "+ letra);
		System.out.println("indexOf = "+ achar);
		System.out.println("indexOf str = "+ acharStr);
		System.out.println("indexOf a partir de = "+ acharP);
		System.out.println("substring = "+ sub);
		System.out.println(str.toUpperCase());
		System.out.println(str.equals("lampada"));
		System.out.println(str.equalsIgnoreCase("lampAdA"));
		System.out.println("replace = "+ rep);
		System.out.println("contains = "+ str.contains("L"));
		System.out.println(trimS.trim());
		
		
	}
}
