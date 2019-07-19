public class NullTest {

public static void main(String[] args) throws ArithmeticException {
	
Adresas namuAdresas = new Adresas(new Miestas("Vilnius"));
System.out.println(gautiMiestoPavadinima(namuAdresas));
}
public static String gautiMiestoPavadinima(Adresas adresas) { 
	String miestoPav = null; 
	if (adresas != null) { 
		Miestas miestas = adresas.getMiestas(); 
		if (miestas != null) { 
			miestoPav = miestas.getPavadinimas(); 
			} 
		} 
	return miestoPav; 
	}
}