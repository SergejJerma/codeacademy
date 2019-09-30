import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.UUID;

public class Payment {
int id;
String name;
LocalDateTime paymentData;
int recipientId;
int payerId;
static long temp;
static long temp1;

public Payment() {
	
	this.id = (int) Math.random()*100000000;
	this.name = UUID.randomUUID().toString();
	this.paymentData = LocalDateTime.now();
	this.recipientId = (int) Math.random()*1000000000;
	this.payerId = (int) Math.random()*10000000;
}

public static void sukurtiAr(int n) {
	
	ArrayList<Payment> list = new ArrayList<>();
	for (int i = 0; i < n; i++) {
		Payment p = new Payment();
		list.add(p);
	}
	long a1 = System.currentTimeMillis();
	for (int j = 0; j< n/2; j++) {
		list.remove(j);
	}
	long a2 = System.currentTimeMillis();
	temp = a2 - a1;
}
public static void sukurtiLn(int n) {
		
		LinkedList<Payment> list1 = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Payment p = new Payment();
			list1.add(p);
		}
		long b1 = System.currentTimeMillis();
		for (int j = 0; j< n/2; j++) {
			list1.remove(j);
		}
		long b2 = System.currentTimeMillis();
		temp1 = b2 - b1;
}

}
