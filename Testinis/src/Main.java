import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate temp = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuMMd");
		String data = temp.format(formatter);
		System.out.println(data);
		
		MyLinked list1 = new MyLinked();
		list1.kint = "pirmas";
		MyLinked list2 = new MyLinked();
		list2.kint = "antras";
		MyLinked list3 = new MyLinked();
		list3.kint = "trecias";
		MyLinked list4 = new MyLinked();
		list4.kint = 3;
		
		list1.next = list2;
		list2.next = list3;
		list3.next = list4;
		
		MyLinked pradzia = list1;
		
		while (pradzia.next != null) {
			System.out.println(pradzia.kint);
			pradzia = pradzia.next;
		}
		System.out.println(pradzia.kint);
	}

}
