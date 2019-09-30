
public class Person {
private int id;
private String vardas;
private String pavarde;
private double receivedMoney;
private double sentMoney;

public Person() {

}

public Person(int id, String vardas, String pavarde) {
	this.id = id;
	this.vardas = vardas;
	this.pavarde = pavarde;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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


public double getReceivedMoney() {
	return receivedMoney;
}
public void setReceivedMoney(double receivedMoney) {
	this.receivedMoney = receivedMoney;
}
public double getSentMoney() {
	return sentMoney;
}
public void setSentMoney(double sentMoney) {
	this.sentMoney = sentMoney;
}
public String toString() {
	return vardas + "," + pavarde+ "," + receivedMoney+ "," + sentMoney +"\n";
}

}
