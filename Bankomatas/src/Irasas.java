
public class Irasas {
	private int irasoId;
	private float piniguSuma;
	private float komisas = 0;
	private float einLikutis;
	private String data;
	private static int count = 1;
	private String kategorija;

	Irasas(){}
	
	
Irasas(int irasoId, float piniguSuma, float komisas, float einLikutis, String data) {
		super();
		this.irasoId = irasoId;
		this.piniguSuma = piniguSuma;
		this.komisas = komisas;
		this.einLikutis = einLikutis;
		this.data = data;
		this.kategorija = kategorija;
	}


	public float getPiniguSuma() {
		return piniguSuma;
	}
	public void setPiniguSuma(float piniguSuma) {
		this.piniguSuma = piniguSuma;
	}
	
	public float getKomisas() {
		return komisas;
	}
	public void setKomisas(float komisas) {
		this.komisas = komisas;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public int getIrasoId() {
		return irasoId;
	}
	public void setIrasoId(int irasoId) {
		this.irasoId = irasoId;
	}
	
	public float getEinLikutis() {
		return einLikutis;
	}
	public void setEinLikutis(float einLikutis) {
		this.einLikutis = einLikutis;
	}
	public static int skaiciuotiID() {
		return count++;
	}
	
	public String getKategorija() {
		return kategorija;
	}
	public void setKategorija(String kategorija) {
		this.kategorija = kategorija;
	}
	public String toString() {
		return String.format("Operacijos nr.: %d \nSuma: %.2f \nEinamasis likutis: %.2f \nVeiksmas: %s \nData: %s \nkomisas: %.2f \n",
				irasoId, piniguSuma, einLikutis, kategorija, data, komisas);
	}
	
}
