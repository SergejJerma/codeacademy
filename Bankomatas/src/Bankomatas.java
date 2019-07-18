import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bankomatas {

	static int pinKodas = 1234;
	static float piniguLikutis = 1000;
	private float temp;
	final String KAT = "paimti pinigai";
	final String KAT1 = "ideti pinigai";
	final float KOMISAS = 0.01F;

	Scanner sc1 = new Scanner(System.in);
	ArrayList<Irasas> irasai = new ArrayList<>();

	public void paimtiPinigus() {

		boolean dar1 = true;
		while (dar1) {
			System.out.println(
					"Iveskite suma, kuria norite paimti\n" + "bankomatas isduoda 10, 20, 50, 100, 200 kupiuromis");
			temp = sc1.nextFloat();
			if (temp % 10 == 0 || temp % 20 == 0 || temp % 50 == 0 || temp % 50 == 0 || temp % 100 == 0
					|| temp % 200 == 0) {
				if (temp <= piniguLikutis) {
					System.out.println("Jusu operacija atlikta \n");
					piniguLikutis -= temp;
					idetiIrasa().setKategorija(KAT);
					dar1 = false;
					if (piniguLikutis == 0) {
						System.out.println("Jusu likutis 0 !!! \n");
					}
				} else
					System.out.println("Nepakanka pinigu saskaitoje. Jusu saskaitos likutis:" + piniguLikutis);
			} else
				System.out.println("Pagal turimas kupiuras bankomatas ivestos sumos isduoti negali");
		}
	}

	public void idetiPinigus() {
		boolean dar1 = true;
		while (dar1) {
			System.out.println(
					"Iveskite suma, kuria norite ideti\n" + "bankomatas priima 10, 20, 50, 100, 200 kupiuromis");
			temp = sc1.nextFloat();
			if (temp % 10 == 0 || temp == 0 || temp % 50 == 0 || temp % 50 == 0 || temp % 100 == 0 || temp % 200 == 0) {

				System.out.println("Jusu operacija atlikta \n");
				piniguLikutis += temp;
				idetiIrasa().setKategorija(KAT1);
				dar1 = false;
			} else
				System.out.println("Pagal idetas kupiuras bankomatas ivestos sumos priimti negali");
		}
	}

	public void balansas() {
		System.out.println("Jusu saskaitos likutis: " + piniguLikutis + "\n");
	}

	public static String laikas() {
		Date data = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String laikas = formatter.format(data);
		return laikas;
	}

	public void spausdintiIsrasa() {
		for (Irasas el : irasai) {
			System.out.println(el);
		}
	}

	public Irasas idetiIrasa() {
		Irasas op = new Irasas(Irasas.skaiciuotiID(), temp, temp * KOMISAS, piniguLikutis, laikas());
		irasai.add(op);
		return op;
	}
}
