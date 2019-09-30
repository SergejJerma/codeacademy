import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String command = "";
		Scanner sc = new Scanner(System.in);
		Tankas tankas = new Tankas();
		boolean dar = true;
		while (dar) {
			System.out.println("Iveskite komanda tankui: \n"
					+ "[s] - i Siaure \n"
					+ "[p] - i Pietus \n"
					+ "[r] - i Rytus \n"
					+ "[v] - i Vakarus \n"
					+ "[q] - suvis \n"
					+ "[i] - info \n"
					+ "[x] - baigti");
			command = sc.next();
			
			switch(command) {
			case "s": tankas.pirmyn();
			break;
			case "p": tankas.atgal();
			break;
			case "r": tankas.desinen();
			break;
			case "v": tankas.kairen();
			break;
			case "q": tankas.sauti();
			break;
			case "i": tankas.info();
			break;
			case "x": dar = false;
			System.out.println("Zaidimas baigtas");
			break;
			default: System.out.println("ivedete neteisinga komanda");
			}
		} 
			sc.close();
	}

}
