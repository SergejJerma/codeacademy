import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Failas {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("src/orig.txt");
		OutputStream out = new FileOutputStream("src/copy.txt");
		for (int c; (c = in.read()) != -1;) {
		out.write(c);
		}
		in.close();
		out.close();
		}


}
