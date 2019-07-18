import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PeopleDatabase {
Map<String, String> people;
String personId;
String personName;
String kodasBePask;

PeopleDatabase() throws IOException{
	people = new HashMap<String, String>();
	
	for (int i = 0; i < PeopleNames.getNamesList().size(); i++) {
		people.put(generateId(), PeopleNames.getNamesList().get(i));
	}
}

public void printMap() {
	people.entrySet().forEach(entry->{
	    System.out.println(entry.getKey() + " " + entry.getValue());  
	 });
}
public List<String> getKey(){
	List<String> keys = new ArrayList<String>(people.keySet());
	return keys;
}

public List<String> getValue(){
	List<String> values = new ArrayList<String>(people.values());
	return values;
}

public List<String> getUniqValue(){
	Set<String> valuesUniq = new HashSet<String>(people.values());
	return new ArrayList<>(valuesUniq);
}

public void genderIs() {
	people.entrySet().forEach(entry->{
		int firstNumber = Character.getNumericValue(entry.getKey().charAt(0)); 
		if (firstNumber == 5) {
			System.out.println(entry.getKey() + " vyras " + entry.getValue());
		}
		else {
			System.out.println(entry.getKey() + " moteris " + entry.getValue());
		}
	 });	
}

public void getByName(String name) {
	people.entrySet().forEach(entry->{
	    if (entry.getValue().equals(name)) {
	    System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	 });
		
}


public String generateId() {
	String personID = null;
	LocalDate temp = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuMMd");
	String data = temp.format(formatter);
	for (int i = 0; i < 1000; i++) {
		Random r = new Random();
		int low = 5;
		int high = 7;
		int result = r.nextInt(high-low) + low;
		int upperBound = 1000;
		int lowerBound = 0;
		int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound)));
		kodasBePask = String.valueOf(result) + data + String.format("%03d", number);
		personID = kodasBePask + paskSkaicius();
	}

	return personID;
}

public String paskSkaicius() {
	ArrayList<Integer> kodas = new ArrayList<>();
	String pask;
	for (int j = 0; j < kodasBePask.length(); j++) {
		int a = Character.getNumericValue(kodasBePask.charAt(j));
		kodas.add(a);		
	}

	int s = 0;
	s = 1*kodas.get(0) + 2*kodas.get(1) + 3*kodas.get(2) + 4*kodas.get(3) +
			5*kodas.get(4) + 6*kodas.get(5) + 7*kodas.get(6) + 8*kodas.get(7) + 
			9*kodas.get(8) + 1*kodas.get(9);

	if (s % 11 != 10) {
		pask = String.valueOf(s % 11);
	} else {
		s = 3*kodas.get(0) + 4*kodas.get(1) + 5*kodas.get(2) + 6*kodas.get(3) +
				7*kodas.get(4) + 8*kodas.get(5) + 9*kodas.get(6) + 1*kodas.get(7) + 
				2*kodas.get(8) + 3*kodas.get(9);
		if (s % 11 != 10) {
			pask = String.valueOf(s % 11);
		}
		else {
			pask = "0";
		}
	}
	return pask;
}

}
