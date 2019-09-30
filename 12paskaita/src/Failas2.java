import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;


public class Failas2 {
public static void main(String[] args) throws IOException {
File failas = new File("src/failas.txt");
readFile1(failas);
}
private static void readFile1(File fin) throws IOException { 
	FileInputStream fis = new FileInputStream(fin); // Construct BufferedReader from InputStreamReader 
	BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
	String line = null; 
	while ((line = br.readLine()) != null) { 
		System.out.println(line); 
		} 
	br.close(); 
	}
}
