
import java.util.Collections;


public class Main1 {

	public static void main(String[] args) {
		X l1 = new X(3);
		X l2 = new X(4);
		X l3 = new X(2);

		System.out.println("pirmo suma: " + l1.suma);
		System.out.println("antro suma: " + l2.suma);
		System.out.println("trecio suma: " + l3.suma);
		
		Y sar = new Y(l1, l2, l3);
		System.out.println("pries sortinima");
		sar.print();
		
		Collections.sort(sar.sarasuY);
		
		System.out.println("po sortinimo");
		sar.print();
		
		Collections.reverse(sar.sarasuY);
		System.out.println("po sortinimo reverse");
		sar.print();

}
}
