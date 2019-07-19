import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Failas1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("src/failas.txt"); 
		BufferedWriter bw = new BufferedWriter(fw); 
		PrintWriter out = new PrintWriter(bw);
		out.println("Sergej Jermacionok"); 
		out.close(); 

	}

}
