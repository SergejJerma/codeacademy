import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		int traukinioVietuSkaicius = 2;
		Traukinys traukinys = new Traukinys(traukinioVietuSkaicius);
		
		String command = "";
		boolean dar = true;
		Scanner sc = new Scanner(System.in);
		while (dar) {
			System.out.println("Valdymo meniu: \n"
					+ "[0] - patikrinti traukinio busena \n"
					+ "[1] - sustabdyti traukini \n"
					+ "[2] - paleisti traukini \n"
					+ "[3] - ilaipinti keleivi \n"
					+ "[4] - islaipinti visus keleivius \n"
					+ "[5] - atspausdinti keleiviu sarasa\n"
					+ "[6] - issaugoti keleiviu sarasa \n"
					+ "[7] - atspausdinti TIK STUDENTU sarasa\n"
					+ "[x] - baigti valdyma");
			command = sc.next();
			sc.nextLine();
			switch(command) {
			case "0": traukinys.busena();
			break;
			case "1": traukinys.sustuoti();
			break;
			case "2": traukinys.vaziuoti();
			break;
			case "3": traukinys.ilaipintiKeleivi();
			break;
			case "4": traukinys.islaipintiVisusKeleivius();
			break;
			case "5": traukinys.gautiKeleiviuSarasa();
			break;
			case "6": traukinys.issaugotiDuomenis();
			break;
			case "7": traukinys.gautiStudentuSarasa();
			break;
			case "x": dar = false;
			System.out.println("Valdymas baigtas");
			break;
			default: System.out.println("ivedete neteisinga veiksma \n veskite dar karta");
			}
		} 
			sc.close();
		
	}

}
