import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Traukinys extends TransportoPriemone {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	int vietuSkaicius;
	boolean busena;
	
	ArrayList<Keleivis> visiKeleiviai = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public Traukinys(int vietuSkaicius) {
	this.vietuSkaicius = vietuSkaicius;
	}
	
	public void busena() {
		if(busena) {
			System.out.println("Traukinys siuo metu sustojes.\n"
					+ "Keleiviu kiekis traukinyje: " +visiKeleiviai.size() +"\n"
							+ "Laisvu vietu traukinyje: " + (vietuSkaicius -visiKeleiviai.size()) +"\n");
		}
		else { 
			System.out.println("Traukinys siuo metu vaziuoja.\n"
					+ "Keleiviu kiekis traukinyje: " +visiKeleiviai.size()+"\n"
							+ "Laisvu vietu traukinyje: " + (vietuSkaicius -visiKeleiviai.size()) +"\n");
		}
	}


	@Override
	public void islaipintiVisusKeleivius() {
		if (busena) {
		visiKeleiviai.clear();
		System.out.println("Visi keleiviai islaipinti \n");
		}
		else System.out.println("Keleiviu islaipinti negalima, traukinys vaziuoja \n");
	}

	@Override
	public boolean vaziuoti() {
		busena = false;
		System.out.println("Traukinys vaziuoja \n");
		return busena;
	}

	@Override
	public boolean sustuoti() {
		busena = true;
		System.out.println("Traukinys sustabdytas \n");
		return busena;
		
	}

	@Override
	public void gautiKeleiviuSarasa() {
		if (visiKeleiviai.size() > 0) {
		for (Keleivis el : visiKeleiviai) {
			System.out.println(el +"\n");
				}
		}
		else System.out.println("Nera keleiviu \n");
	}

	@Override
	public void issaugotiDuomenis() {
		try {
		File failas = new File("src/isaugotiDuomenys.csv");
		PrintWriter inFailas = new PrintWriter(failas);
		for (Keleivis el : visiKeleiviai) {
			inFailas.append(el.getVardas());
			inFailas.append(COMMA_DELIMITER);
			inFailas.append(el.getPavarde());
			inFailas.append(NEW_LINE_SEPARATOR);
		}

		inFailas.flush();
		inFailas.close();
		System.out.println("Failas buvo sekmingai sukurtas \n");
	} catch (IOException e) {
		System.out.println("Klaida su irasymu");
		e.printStackTrace();
	}
		
}


	@Override
	public void ilaipintiKeleivi() {
		int numeris = 0;
		if (busena) {
		if (visiKeleiviai.size() < vietuSkaicius) {
			System.out.println("Iveskite keleivio varda:");
			String a = sc.nextLine();
			System.out.println("Iveskite keleivio pavarde:");
			String b = sc.nextLine();
			System.out.println("Ar studentas? jei taip - iveskite studento paz. nr.");
			numeris = sc.nextInt();
			sc.nextLine();
			if (numeris == 0 ) {
			Keleivis k = new Keleivis(a,b);
			System.out.println("Keleivis ilaipintas \n");
			visiKeleiviai.add(k);
			} else {
				Keleivis k = new Studentas (a, b, numeris);
				visiKeleiviai.add(k);
			}
		}
		else System.out.println("Traukinys pilnas, ilipti negalima \n");
	} 
	else System.out.println("Traukinys vaziuoja, ilipti negalima \n");
		
	}

	public void gautiStudentuSarasa() {
		if (visiKeleiviai.size() > 0) {
			int temp = 0;
		for (Keleivis el : visiKeleiviai) {
			if (el instanceof Studentas) {
				temp ++;
				System.out.println(el +"\n");
				}
			
			}
		if (temp == 0) {
			System.out.println("Studentu nera");
			}
	}
		else System.out.println("Nera keleiviu \n");
  }
}
