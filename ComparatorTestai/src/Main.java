import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		File failas = new File("C:/Users/User/Desktop/failas/people.txt");
		ArrayList<Student> list = new ArrayList<Student>();
		final String COMMA_DELIMITER = ",";

		FileInputStream fis = new FileInputStream(failas); // Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		int counter = 0;
		while ((line = br.readLine()) != null) {
			String[] a = line.split(COMMA_DELIMITER);
			counter++;
			if (counter >= 2) {
				Student student = new Student(Integer.parseInt(a[0]), a[1].replaceAll("\\s+", ""),
						a[2].replaceAll("\\s+", ""));

				list.add(student);
			}
		}
		br.close();
		Collections.sort(list);
//			for (Student el: list) {
//				System.out.println(el);
//			}

		System.out.println(list.size());

		JavaSudentGroup number = new JavaSudentGroup(7);
		int papildStud = list.size() % number.getNumberOfStudens();

		int temp = list.size() / number.getNumberOfStudens();
		int k = 0;
		if (papildStud == 0) {
			for (int j = 1; j < number.getNumberOfStudens() + 1; j++) {
				System.out.println(j + " grupe");
				for (int i = k; i < k + temp; i++) {
					System.out.print("nr. " + (i+1) +" ");
					System.out.println(list.get(i));
				}
				k += temp;
			}
		} else {
			int z = 1;
			for (int j = 1; j < number.getNumberOfStudens() + 1; j++) {
				System.out.println(j + " grupe");
				for (int i = k; i < k + temp + z; i++) {
					System.out.print("nr. " + (i+1) +" ");
					System.out.println(list.get(i));
				}
				k += (temp+z);
				papildStud--;
				if (papildStud == 0) {
					z = 0;
				}
			}
		}
	}
}
