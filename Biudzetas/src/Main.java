import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String command = "";
		Biudzetas b1 = new Biudzetas();
		boolean dar = true;
		Scanner sc = new Scanner(System.in);
		while (dar) {
			System.out.println("Iveskite ka norite daryti: \n"
					+ "[1] - ivesti irasa \n"
					+ "[2] - gauti visus pajamu irasus \n"
					+ "[3] - gauti visus islaidu irasus \n"
					+ "[4] - redaguoti irasa \n"
					+ "[5] - atnaujinti irasa \n"
					+ "[6] - gauti balansa \n"
					+ "[7] - isaugoti duomenis faile \n"
					+ "[8] - gauti duomenis is failo \n"
					+ "[x] - baigti darba");
			command = sc.next();
			switch(command) {
			case "1": b1.pridetiIrasa();
			break;
			case "2": b1.gautiPajamuIrasa();
			break;
			case "3": b1.gautiIslaiduIrasa();
			break;
			case "4": b1.redaguotiIrasa();
			break;
			case "5": b1.atnaujintiIrasa();
			break;
			case "6": b1.gautiBalansa();
			break;
			case "7": b1.issaugotiDuomenis();
			break;
			case "8": b1.gautiDuomenis();
			break;
			case "x": dar = false;
			System.out.println("Darbas baigtas");
			break;
			default: System.out.println("ivedete neteisinga veiksma \n veskite dar karta");
			}
		} 
			sc.close();
	}

}
