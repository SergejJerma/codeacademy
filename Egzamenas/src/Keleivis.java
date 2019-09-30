
public class Keleivis {
	protected String vardas;
	protected String pavarde;
	
	
	public Keleivis(String vardas, String pavarde) {
		this.vardas = vardas;
		this.pavarde = pavarde;
	}
	
	public String toString() {
		return String.format("Keleivio vardas: %s \nKeleivio pavarde: %s", vardas, pavarde);
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public String getPavarde() {
		return pavarde;
	}

	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	
}
