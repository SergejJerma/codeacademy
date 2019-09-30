import java.util.ArrayList;
import java.util.Scanner;

public class Valid {
boolean validus = false;
Scanner sc = new Scanner(System.in);
ArrayList <Integer> kodas = new ArrayList<>();
int tikrint = 0;

	public void tikrintiPVM() {
		System.out.println("Iveskite PVM koda, kuri norite patikrinti");
		String temp = sc.nextLine();
		for (int i = 0; i < temp.length(); i++) {
	
			int a = Character.getNumericValue(temp.charAt(i));
			kodas.add(a);
		}
		
		int a1 = 0;
		for (int j =0; j < 8; j++) {
		a1 += (j+1)*kodas.get(j);	
		}
		int r1 = a1 % 11;
		
		if (r1 != 10) {
			tikrint = r1;
		}
		else {
			int a2 = 3*kodas.get(0) +4*kodas.get(1) + 5*kodas.get(2)+6*kodas.get(3)+
					7*kodas.get(4)+8*kodas.get(5)+9*kodas.get(6) +1*kodas.get(7);
			int r2 = a2 % 11;
			if (r2 == 0) {
				tikrint = 0;
			} else { tikrint= r2;}
		}
		
		if (kodas.get(8) == tikrint && kodas.get(7) == 1) {
			System.out.println("Validus");
		} else {System.out.println("Nevalidus");}
	
	}
	
}
