import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DeckOfCards doc = new DeckOfCards();
		String command = "";
		boolean dar = true;
		Scanner sc = new Scanner(System.in);
		while (dar) {
			System.out.println("Iveskite ka norite daryti: \n"
					+ "[1] - sukurti kalade\n"
					+ "[2] - sumaisyti kalade \n"
					+ "[3] - atspausdinti kalade \n"
					+ "[4] - zaisti BJ \n"
					+ "[x] - baigti darba");
			command = sc.next();
			switch(command) {
			case "1": doc.sukurtiKalade();
			break;
			case "2": doc.sumaisytiKalade();
			break;
			case "3": doc.atspausdintiKalade();
			break;
			case "4": doc.zaistiBJ();;
			break;

			case "x": dar = false;
			System.out.println("Zaidimas baigtas");
			break;
			default: System.out.println("ivedete neteisinga veiksma \n veskite dar karta");
			}
		} 
			sc.close();
	

	}

}
