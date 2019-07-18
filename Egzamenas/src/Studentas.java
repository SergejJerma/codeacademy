
public class Studentas extends Keleivis {
 private int studNr;


public Studentas(String vardas, String pavarde, int studNr) {
	super(vardas, pavarde);
	this.studNr = studNr;
}

public int getStudNr() {
	return studNr;
}

public void setStudNr(int studNr) {
	this.studNr = studNr;
}
public String toString() {
	return String.format("Keleivio vardas: %s \nKeleivio pavarde: %s \nPazym numeris: %d", vardas, pavarde, studNr);
}
}
