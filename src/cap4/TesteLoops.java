package cap4;

public class TesteLoops {
	public static void main(String[] args) {
		final int menuOp = 127;
		final char a = 66;
		final short b = 'b';
		byte c = (byte)1L;
		
		switch (c) {
		case 'A':
			System.out.println("Ligar!");
			break;
		case b:
			System.out.println("Standby!");
			break;
		case a:
			System.out.println("Desligar");
			break;
		case menuOp:
			System.out.println("Mudo");
			break;

		default: case 4:System.out.println("Nada aconteceu!");
			break;
		}
		
	}
}
