import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/people.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person[] people = (Person[]) ois.readObject();
		
		
		System.out.println(Arrays.toString(people));
	
		
	}

}
