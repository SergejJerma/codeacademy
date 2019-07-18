
public class Darbuotojas {
private int alga;
private int darbas;
Darbuotojas(){
	
}
Darbuotojas(int alga, int darbas){
	this.alga = alga;
	this.darbas = darbas;
}
public void gautiInfo() {
	System.out.println("alga: "+ alga + ", ir darbo laikas: "+darbas);
}

public void pridetiAtlyginima() {
	if (alga > 500) {
		alga += 500;
	}
}
public int getAlga() {
	return alga;
}
public void setAlga(int alga) {
	this.alga = alga;
}
public int getDarbas() {
	return darbas;
}
public void setDarbas(int darbas) {
	this.darbas = darbas;
}

public void  pridetiDarba(int darbas) {
	this.alga +=5;
	this.darbas += darbas;
}
}
