
public class Irasas {

	protected int id;
	protected float suma;
	protected String laikas;
	protected String komentaras;
	private static int count = 0;
	
	
	public float getSuma() {
		return suma;
	}
	public void setSuma(float suma) {
		this.suma = suma;
	}
	public String getLaikas() {
		return laikas;
	}
	public void setLaikas(String laikas) {
		this.laikas = laikas;
	}
	public String getKomentaras() {
		return komentaras;
	}
	public void setKomentaras(String komentaras) {
		this.komentaras = komentaras;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public static int skaiciuoti() {
		return count++;
	}

}
