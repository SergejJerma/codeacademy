
public class Skaitliukas {
	static String n = "000";

	static void didinti() {

		int i = Integer.parseInt(n);
		i++;
		n = String.format("%03d", i);

	}
	
	static String atstatytiN() {
		return n = "000";
	}

}
