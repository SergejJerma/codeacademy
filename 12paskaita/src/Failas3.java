import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Failas3 {

	public static void main(String[] args) throws IOException {

		FileReader failas = new FileReader("src/failas.txt");
		BufferedReader reader = new BufferedReader(failas);
		String line = null;
		String temp ="";
		while((line = reader.readLine()) != null) {
			System.out.println(line);
			temp = line;
		}
		
		StringBuilder input1 = new StringBuilder(temp);
		
		
		FileWriter fw = new FileWriter("src/copy.txt"); 
		BufferedWriter bw = new BufferedWriter(fw); 
		PrintWriter out = new PrintWriter(bw);
		out.println(input1.reverse()); 
		out.close(); 
		
	}	

}
