import java.util.Scanner;

public class Pagrindine {

	public static void main(String[] args) {
		String command = "";
		Bankomatas b1 = new Bankomatas();
		boolean dar = true;
		boolean pin = true;
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		
		while(pin) {
			System.out.println("Iveskite PIN koda: **** ");
			
			if (Bankomatas.pinKodas == sc.nextInt()) {
		
			
		while (dar) {
			System.out.println("Iveskite ka norite daryti: \n"
					+ "[1] - paimti pinigus \n"
					+ "[2] - ideti pinigus \n"
					+ "[3] - balansas \n"
					+ "[4] - spausdinti israsa \n"
					+ "[x] - baigti darba");
			command = sc.next();
			switch(command) {
			case "1": b1.paimtiPinigus();
			break;
			case "2": b1.idetiPinigus();
			break;
			case "3": b1.balansas();
			break;
			case "4": b1.spausdintiIsrasa();
			break;
			case "x": dar = false;
					  pin = false;
			System.out.println("Darbas baigtas");
			break;
			default: System.out.println("ivedete neteisinga veiksma \n veskite dar karta");
			}
		} 
			sc.close();
			}
			else {
				System.out.println("Ivestas neteisingas PIN kodas \n");
						counter++;
			}
			if (counter == 3) {
				pin = false;
				System.out.println("Tris kartus neteisingai ivedete, del to Jusu PIN uzblokuotas");
			}
		}

	}

}
