import java.util.Random;

public class Lektuvas {
	
	public void isskleistiVaziuokle() { 
				
		try {
			vaziuokle();
			System.out.println("OK: vaziuokle sekmingai isleista");
			}
		catch (SvarbiKlaida e) {
			System.out.println("ERROR: nepavyko iskleisti vaziuokles. Priezastis: " 
		 + e.getPriezastis() + ". Svarbumas: svarbi");
		}		
		catch (LaikinaKlaida e) {
			System.out.println("ERROR: nepavyko iskleisti vaziuokles. Priezastis: " 
		 + e.getPriezastis() + ". Svarbumas: laikina");
		}		
		 catch (VaziuoklesIsskleidimoKlaida e) {
			System.out.println("ERROR: nepavyko iskleisti vaziuokles. Priezastis: " 
		 + e.getPriezastis()+ ". Svarbumas: nenustatytas");
		}		

	}
	
	void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
		Random rand = new Random();
		int x = rand.nextInt(10);
		switch (x) {
		case 0: throw new SvarbiKlaida("Neatsidare durys");
		case 1: throw new LaikinaKlaida("Nusileido ratas");
		case 2: throw new VaziuoklesIsskleidimoKlaida("Per didelis aukstis");
		case 3: throw new SvarbiKlaida("Gaisras");
		}
	}
}
