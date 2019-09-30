import java.io.IOException;

public class Main3 {
	
	

	public static void main(String[] args) throws IOException {
		
		PeopleDatabase p = new PeopleDatabase();
		switch(args[0]) {
		case "1": p.printMap();
		break;
		case "2": p.getByName(args[1]);
		break;
		case "-h": System.out.println("1 - atspaudinti visa sarasa \n"
				+ "2 - atspausdinti sarasa pagal varda (papildomas argumentas vardas");
		break;
		default:
		}
		
//	p.printMap();
//		System.out.println(p.getKey());
//		p.printMap();
//		System.out.println(p.getValue());
//		System.out.println(p.getUniqValue());
//		p.genderIs();
//		p.getByName("Elba");
	}

}
