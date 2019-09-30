
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Biudzetas {

	ArrayList<Irasas> irasai = new ArrayList<>();

	Scanner sc1 = new Scanner(System.in);

	private boolean runProgram;
	private int idInt = 0;
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	public void pridetiIrasa() {
		int skInt = 0;
		runProgram = true;
		while (runProgram) {
			System.out.println("Pasirinkite: [1] - pajamu, ar [2] - islaidu");
			String skStr = sc1.next();
			try {
				skInt = Integer.parseInt(skStr);
				if (skInt == 1 || skInt == 2) {
					runProgram = false;
				} else
					System.out.println("ivestas neteisingas skaicius \n bandykite dar karta");
			} catch (NumberFormatException e) {
				System.out.println("neteisingas ivedimas \n bandykite dar karta");
			}
		}
		if (skInt == 1) {
			pridetiPajamuIrasa();
		} else
			pridetiIslaiduIrasa();
	}

	public void pridetiPajamuIrasa() {
		runProgram = true;
		Irasas irasas = new PajamuIrasas();
		irasas.setId(Irasas.skaiciuoti());
		while (runProgram) {
			System.out.println("Iveskite pajamu iraso suma:");
			String sumaStr = sc1.next();
			try {
				float sumaFloat = Float.parseFloat(sumaStr);
				irasas.setSuma(sumaFloat);
				runProgram = false;
			} catch (NumberFormatException e) {
				System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
			}
		}
		irasas.setLaikas(laikas());
		sc1.nextLine();
		System.out.println("Iveskite pajamu iraso komentara:");
		irasas.setKomentaras(sc1.nextLine());
		((PajamuIrasas) irasas).setPajamuKategorija(PajamuIrasas.PAJ_KAT);
		System.out.println("Iveskite pajamu iraso paskirti:");
		((PajamuIrasas) irasas).setPajamuTipas(sc1.nextLine());
		irasai.add(irasas);
	}

	public void pridetiIslaiduIrasa() {
		runProgram = true;
		Irasas irasas = new IslaiduIrasas();
		irasas.setId(Irasas.skaiciuoti());
		while (runProgram) {
			System.out.println("Iveskite islaidu iraso suma:");
			String sumaStr = sc1.next();
			try {
				float sumaFloat = Float.parseFloat(sumaStr);
				irasas.setSuma(sumaFloat);
				runProgram = false;
			} catch (NumberFormatException e) {
				System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
			}
		}
		irasas.setLaikas(laikas());
		sc1.nextLine();
		System.out.println("Iveskite islaidu iraso komentara:");
		irasas.setKomentaras(sc1.nextLine());
		((IslaiduIrasas) irasas).setIslaiduKategorija(IslaiduIrasas.ISL_KAT);
		System.out.println("Iveskite islaidu iraso paskirti:");
		((IslaiduIrasas) irasas).setIslaiduTipas(sc1.nextLine());
		irasai.add(irasas);
	}

	public void gautiPajamuIrasa() {
		for (Irasas el : irasai) {
			if (el instanceof PajamuIrasas) {
				System.out.println(el);
			}
		}

	}

	public void gautiIslaiduIrasa() {
		for (Irasas el : irasai) {
			if (el instanceof IslaiduIrasas) {
				System.out.println(el);
			}
		}
	}

	public static String laikas() {
		Date data = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String laikas = formatter.format(data);
		return laikas;
	}

	public void gautiBalansa() {
		float balansas = 0;

		for (Irasas el : irasai) {
			if (el instanceof PajamuIrasas) {
				balansas += el.getSuma();
			} else {
				balansas -= el.getSuma();
			}
		}

		System.out.println("Jusu pajamu/islaidu balansas: " + balansas + "\n");
	}

	public void redaguotiIrasa() {
		runProgram = true;
		for (Irasas el : irasai) {
			System.out.println(el);
		}
		validuotiID();
		for (Irasas el : irasai) {
			if (el.getId() == idInt) {
				System.out.println("Suma: " + el.getSuma());
				int skInt = 0;
				runProgram = true;
				while (runProgram) {
					System.out.println("Pasirinkite: [1] - redaguoti ar [2] - toliau");
					String skStr = sc1.next();
					try {
						skInt = Integer.parseInt(skStr);
						if (skInt == 1 || skInt == 2) {
							runProgram = false;
						} else
							System.out.println("ivestas neteisingas skaicius \n bandykite dar karta");
					} catch (NumberFormatException e) {
						System.out.println("neteisingas ivedimas \n bandykite dar karta");
					}
				}
				if (skInt == 1) {
					runProgram = true;
					while (runProgram) {
						System.out.println("Iveskite nauja sumos reiksme:");
						String sumaStr = sc1.next();
						try {
							float sumaFloat = Float.parseFloat(sumaStr);
							el.setSuma(sumaFloat);
							runProgram = false;
						} catch (NumberFormatException e) {
							System.out.println("Ivestas neteisingas sumo formatas \n bandykite dar karta");
						}
					}
				}
			}
		}
	}

	public void atnaujintiIrasa() {

		for (Irasas el : irasai) {
			System.out.println(el);
		}
		validuotiID();
		for (Irasas el : irasai) {
			if (el.getId() == idInt) {
				el.setLaikas(laikas());
				System.out.println("Iveskite naujinamo iraso suma:");
				el.setSuma(sc1.nextFloat());
				sc1.nextLine();
				System.out.println("Iveskite naujinamo iraso komentara:");
				el.setKomentaras(sc1.nextLine());
				System.out.println("Iveskite naujinamo iraso paskirti:");
				if (el instanceof PajamuIrasas) {
					((PajamuIrasas) el).setPajamuTipas(sc1.nextLine());
				} else {
					((IslaiduIrasas) el).setIslaiduTipas(sc1.nextLine());
				}
				System.out.println("Irasas atnaujintas");
			}
		}
	}

	public int validuotiID() {
		runProgram = true;
		while (runProgram) {
			System.out.println("Iveskite iraso ID:");
			String idStr = sc1.next();
			try {
				idInt = Integer.parseInt(idStr);
				if (idInt < irasai.size()) {
					runProgram = false;
				} else
					System.out.println("ivestas neteisingas ID \n bandykite dar karta");
			} catch (NumberFormatException e) {
				System.out.println("neteisingas ivedimas \n bandykite dar karta");
			}
		}
		return idInt;
	}

	public void issaugotiDuomenis() {
		try {
			File failas = new File("C:/Users/User/Desktop/isaugotiDuomenys.csv");
//			FileWriter fw = new FileWriter("src/isaugotiDuomenys.csv");
//			BufferedWriter bw = new BufferedWriter(fw); 
			PrintWriter inFailas = new PrintWriter(failas);
			for (Irasas el : irasai) {
				if (el instanceof PajamuIrasas) {
					inFailas.append(((PajamuIrasas) el).getPajamuKategorija());
					inFailas.append(COMMA_DELIMITER);
					inFailas.append(((PajamuIrasas) el).getPajamuTipas());
				} else {
					inFailas.append(((IslaiduIrasas) el).getIslaiduKategorija());
					inFailas.append(COMMA_DELIMITER);
					inFailas.append(((IslaiduIrasas) el).getIslaiduTipas());
				}
				inFailas.append(COMMA_DELIMITER);
				inFailas.append(String.valueOf(el.getId()));
				inFailas.append(COMMA_DELIMITER);
				inFailas.append(String.valueOf(el.getSuma()));
				inFailas.append(COMMA_DELIMITER);
				inFailas.append(el.getKomentaras());
				inFailas.append(COMMA_DELIMITER);
				inFailas.append(laikas());
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

	public void gautiDuomenis() {
		String line = "";
		try {
			File failas = new File("src/pradiniaiDuomenys.csv");
			Scanner scFailas = new Scanner(failas);

//			FileReader failas = new FileReader("src/pradiniaiDuomenys.csv");		
//			BufferedReader fileReader = new BufferedReader(failas);

			while (scFailas.hasNextLine()) {
				line = scFailas.nextLine();
				String[] a = line.split(COMMA_DELIMITER);
				System.out.println(Arrays.toString(a)); // spausdina masyva
				if (a[0].equals("P")) {
					Irasas irasas = new PajamuIrasas();
					irasas.setId(Irasas.skaiciuoti());
					((PajamuIrasas) irasas).setPajamuKategorija(a[0]);
					((PajamuIrasas) irasas).setPajamuTipas(a[1]);
					irasas.setKomentaras(a[3]);
					irasas.setSuma(Float.parseFloat(a[2]));
					irasas.setLaikas(laikas());
					irasai.add(irasas);
				} else {
					Irasas irasas = new IslaiduIrasas();
					irasas.setId(Irasas.skaiciuoti());
					((IslaiduIrasas) irasas).setIslaiduKategorija(a[0]);
					((IslaiduIrasas) irasas).setIslaiduTipas(a[1]);
					irasas.setKomentaras(a[3]);
					irasas.setSuma(Float.parseFloat(a[2]));
					irasas.setLaikas(laikas());
					irasai.add(irasas);
				}
			}
			System.out.println("Failas sekmingai nuskaitytas \n");
			scFailas.close();
			// fileReader.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	public void trintiIrasa() {

		for (Irasas el : irasai) {
			System.out.println(el);
		}
		validuotiID();
		for (Irasas el : irasai) {
			if (el.getId() == idInt) {
				irasai.remove(el);
				}
				System.out.println("Irasas istrintas");
			}
		
	}
}
