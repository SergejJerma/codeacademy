import java.util.ArrayList;
import java.util.Random;

public class X  implements Comparable <X> {
ArrayList <Integer> sarasasX;
int elSkaicius;
int suma;

public X(int elSkaicius) {
	this.elSkaicius = elSkaicius;
	this.sarasasX = new ArrayList<Integer>();
	for (int i = 0; i < this.elSkaicius; i++) {
		int temp = new Random().nextInt()/100000000;
		this.sarasasX.add(temp);
		this.suma += temp;
	}
}

	
public int getSuma() {
	return suma;
}


public void print() {
	System.out.println(this.sarasasX);
}



@Override
public int compareTo(X o) {
	return this.getSuma() - o.getSuma();
}


}









	


