import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PeopleNames {

	static ArrayList<String> getNamesList() throws IOException {
		ArrayList<String> namesList = new ArrayList<String>();
		String name = null;
		File peopleNames = new File("C:/Users/User/Desktop/failas/peopleName.txt");
		FileInputStream fis1 = new FileInputStream(peopleNames);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(fis1));
		while ((name = br1.readLine()) != null) {
			namesList.add(name);
		}
		br1.close();
		return namesList;
	}
}
