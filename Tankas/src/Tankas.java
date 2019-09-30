import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tankas {
int x = 0;
int y = 0;
int suvisVisi = 0;
int suvisS = 0;
int suvisR = 0;
int suvisV = 0;
int suvisP = 0;
String kryptis = "Siaure";

public void pirmyn(){
y++;
kryptis = "Siaure";
laikas();
System.out.println(" Tankas pajuda i Siaure " + "("+x+";"+y+")\n");
}

public void desinen(){
x++;
kryptis = "Rytus";
laikas();
System.out.println(" Tankas pajuda i Rytus " + "("+x+";"+y+")\n");
}

public void kairen(){
x--;
kryptis = "Vakarus";
laikas();
System.out.println(" Tankas pajuda i Vakarus " + "("+x+";"+y+")\n");
}

public void atgal(){
y--;
kryptis = "Pietus";
laikas();
System.out.println(" Tankas pajuda i Pietus " + "("+x+";"+y+")\n");
}

public void sauti() {
suvisVisi++;
laikas();
System.out.println(" Suvis i " + kryptis +"\n");
if (kryptis == "Siaure") {
	suvisS++;
} else if (kryptis == "Rytus") {
	suvisR++;
} else if (kryptis == "Vakarus") {
	suvisV++;
} else if (kryptis == "Pietus") {
	suvisP++;
}
}

public void info(){
	System.out.println("Tanko suviai: " + suvisS +" i Siaure, "+ suvisR +" i Rytus, "+ suvisV +" i Vakarus, "+ suvisP +" i Pietus. "+"Viso suviu: "+suvisVisi);
	System.out.println("Tanko koordinates:" + "("+x+";"+y+")" + " Kryptis i " + kryptis +"\n" );
}
public void laikas() {
	LocalDateTime laikas = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
	String formatuotaData = laikas.format(dtf);
	System.out.print("["+formatuotaData+"]");
}

}
