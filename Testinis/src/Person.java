import java.io.Serializable;

public class Person implements Serializable {
 int age;
 String name;
public Person(int age, String name) {
	this.age = age;
	this.name = name;
}
 
public String toString() {
	return age + ":"+ name;
}
}
