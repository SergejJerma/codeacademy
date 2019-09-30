import java.util.Scanner;

public class Pavyzdys {
	public void m1() {
		System.out.println("Pirmas metodas");
		m2();
	}
	public void m2() {
		System.out.println("Antras metodas");
		m3();
	}
	public void m3() {
		System.out.println("Trecias metodas");
	}
	public void spausdink(String vardas, String pavarde, String kalba, int savSkaicius) {
		System.out.println("Aš, " +vardas +" "+ pavarde +", tikrai išmoksiu programuoti"+ " "+kalba 
				+ " kalba per " + savSkaicius + " savaites");
	}
	public void spausdink(String vardas, String pavarde, String kalba) {
		System.out.println("Aš, " +vardas +" "+ pavarde +", tikrai išmoksiu programuoti"+ " "+kalba 
				+ " kalba");
	}
	
	public double m10() {
	//	double i = 123.5;
		return 123.5; 
	}
	
	public double m11() {
		Scanner sk = new Scanner(System.in);
		System.out.println("Ivesk skaiciu double: ");
		double a = sk.nextDouble();
		return a;
		
	}
}
