import java.util.Scanner;

public class Asmuo {
	
	private String name;
	private String surname;
	private int age;
	
	Asmuo(){
		
	}
	Asmuo(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void Ivesti() {
		Scanner name = new Scanner(System.in);
		System.out.println("Ivesti varda:");	
		this.name = name.nextLine();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
