import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AK {

	Scanner sc = new Scanner(System.in);

	String tempAK;
	String pask;
	int berniukai = 0;
	

	public void generuotiAK() {
		System.out.println("Iveskite gimimo dara YYYYMMDD formatu");
		String temp = sc.nextLine();
		
		for (int i = 0; i < 1000; i++) {
			Random r = new Random();
			int low = 5;
			int high = 7;
			int result = r.nextInt(high-low) + low;
			if (result == 5) { 
				berniukai++;
				}
			tempAK = String.valueOf(result) + temp.substring(2, 8) + Skaitliukas.n;
			String asmensKodas = tempAK;
			Skaitliukas.didinti();
			System.out.println(asmensKodas + paskSkaicius());
		
		}
	System.out.println("berniuku: " + berniukai);
	System.out.println("mergaiciu: " + (1000 - berniukai));
	}

	public String paskSkaicius() {
		ArrayList<Integer> kodas = new ArrayList<>();
		for (int j = 0; j < tempAK.length(); j++) {
			int a = Character.getNumericValue(tempAK.charAt(j));
			kodas.add(a);		
		}

		int s = 0;
		s = 1*kodas.get(0) + 2*kodas.get(1) + 3*kodas.get(2) + 4*kodas.get(3) +
				5*kodas.get(4) + 6*kodas.get(5) + 7*kodas.get(6) + 8*kodas.get(7) + 
				9*kodas.get(8) + 1*kodas.get(9);

		if (s % 11 != 10) {
			pask = String.valueOf(s % 11);
		} else {
			s = 3*kodas.get(0) + 4*kodas.get(1) + 5*kodas.get(2) + 6*kodas.get(3) +
					7*kodas.get(4) + 8*kodas.get(5) + 9*kodas.get(6) + 1*kodas.get(7) + 
					2*kodas.get(8) + 3*kodas.get(9);
			if (s % 11 != 10) {
				pask = String.valueOf(s % 11);
			}
			else {
				pask = "0";
			}
		}
		return pask;
	}

}
