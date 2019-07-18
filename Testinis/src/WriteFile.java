import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		Person[] people = {new Person(11, "Jonas"), 
				new Person(33, "Darius"),new Person(22, "Petras")};

		
		FileOutputStream fos = new FileOutputStream("src/people.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(people);
				
		oos.close();
	}

}
