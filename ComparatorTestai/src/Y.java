import java.util.ArrayList;


public class Y{

	ArrayList<X> sarasuY = new ArrayList<>();

	
	public Y(X list1, X list2, X list3 ) {
//		ArrayList<X> sarasuY = new ArrayList<>();
		sarasuY.add(list1);
		sarasuY.add(list2);
		sarasuY.add(list3);
	
	}

	public void print() {
		for (X el: sarasuY) {
			el.print();
		}
	}


}

	

