import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Pagrindine {

	public static void main(String[] args) throws Throwable {
		final String COMMA_DELIMITER = ",";
		final String NEW_LINE_SEPARATOR = "\n";
		File failas = new File("C:/Users/User/Desktop/failas/people.txt");
		File failas1 = new File("C:/Users/User/Desktop/failas/payment.txt");
		File failas2 = new File("C:/Users/User/Desktop/failas/failasGauti.txt");
		File failas3 = new File("C:/Users/User/Desktop/failas/peopleName.txt");
		Map<Integer, Person> visiAsmenys = new HashMap<>();

		FileInputStream fis = new FileInputStream(failas); // Construct BufferedReader from InputStreamReader 
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)); 
			String line = null; 
			int counter = 0;
			while ((line = br.readLine()) != null) { 
				Person asmuo = new Person();
				String[] a = line.split(COMMA_DELIMITER);
				counter++;
				if (counter >= 2) {
		//		Person asmuo = new Person(Integer.parseInt(a[0]),a[1],a[2]);
				asmuo.setId(Integer.parseInt(a[0]));
				asmuo.setVardas(a[1].replaceAll("\\s+", ""));
				asmuo.setPavarde(a[2].replaceAll("\\s+", ""));
				visiAsmenys.put(asmuo.getId(), asmuo);
				}
			} 
			
			FileInputStream fis1 = new FileInputStream(failas1); // Construct BufferedReader from InputStreamReader 
			BufferedReader br1 = new BufferedReader(new InputStreamReader(fis1)); 
				String line1 = null; 
				int counter1 = 0;
				while ((line1 = br1.readLine()) != null) { 
					String[] a1 = line1.split(COMMA_DELIMITER);
					counter1++;
					if (counter1 >= 2) {
					int tempGavId = Integer.parseInt(a1[2].replaceAll("\\s+", ""));
					int tempSiunId = Integer.parseInt(a1[3].replaceAll("\\s+", ""));
					double tempPavSuma = Double.parseDouble(a1[1]);
					double visaGautSuma = tempPavSuma + visiAsmenys.get(tempGavId).getReceivedMoney();
					double visaIsiusSuma = tempPavSuma + visiAsmenys.get(tempSiunId).getSentMoney();
					visiAsmenys.get(tempGavId).setReceivedMoney(visaGautSuma);
					visiAsmenys.get(tempSiunId).setSentMoney(visaIsiusSuma);
					
					}
				} 
				PrintWriter inFailasGauti = new PrintWriter(failas2);
				
				List<Entry<Integer, Person>> list = new LinkedList<Map.Entry<Integer,Person>>(visiAsmenys.entrySet());
				Collections.sort(list, new Comparator<Entry<Integer, Person>>() {

					@Override
					public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
					//	return String.valueOf(o2.getValue().getReceivedMoney()).compareTo(String.valueOf(o1.getValue().getReceivedMoney()));
						return (int) (o2.getValue().getReceivedMoney()- o1.getValue().getReceivedMoney());
					}
				});
				for (Entry<Integer, Person> el : list) {	
					inFailasGauti.append(String.valueOf(el.getValue().getId()));
					inFailasGauti.append(COMMA_DELIMITER);
					inFailasGauti.append(el.getValue().getVardas());
					inFailasGauti.append(COMMA_DELIMITER);
					inFailasGauti.append(el.getValue().getPavarde());
					inFailasGauti.append(COMMA_DELIMITER);
					inFailasGauti.append(String.valueOf(el.getValue().getReceivedMoney()));
//					inFailasGauti.append(COMMA_DELIMITER);
//					inFailasGauti.append(String.valueOf(el.getValue().getSentMoney()));
					inFailasGauti.append(NEW_LINE_SEPARATOR);
	
				}
				inFailasGauti.flush();
				inFailasGauti.close();
				
				PrintWriter inFailasIsiusti = new PrintWriter(failas3);
				Collections.sort(list, new Comparator<Entry<Integer, Person>>() {

					@Override
					public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
						//return String.valueOf(o2.getValue().getSentMoney()).compareTo(String.valueOf(o1.getValue().getSentMoney()));
						return (int) (o2.getValue().getReceivedMoney()-o1.getValue().getReceivedMoney());
					}
				});
				
				System.out.println("VEIKIA");
				
				for (Entry<Integer, Person> el : list) {	
//					inFailasIsiusti.append(String.valueOf(el.getValue().getId()));
//					inFailasIsiusti.append(COMMA_DELIMITER);
					inFailasIsiusti.append(el.getValue().getVardas());
//					inFailasIsiusti.append(COMMA_DELIMITER);
//					inFailasIsiusti.append(el.getValue().getPavarde());
//					inFailasIsiusti.append(COMMA_DELIMITER);
//					inFailasIsiusti.append(String.valueOf(el.getValue().getReceivedMoney()));
//					inFailasIsiusti.append(COMMA_DELIMITER);
//					inFailasIsiusti.append(String.valueOf(el.getValue().getSentMoney()));
		inFailasIsiusti.append(NEW_LINE_SEPARATOR);
					}
				inFailasIsiusti.flush();
				inFailasIsiusti.close();
			//	System.out.println(Collections.singletonList(visiAsmenys));

			
				br.close();
				br1.close(); 
			}

	
		}


	

