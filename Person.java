package pratices_demo2;

import java.util.Scanner;

public class Person {
	String name;
	String email;
	
	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, String email) {
		System.out.println("Peson(String,String)");
		this.name = name;
		this.email = email;
	}
	
	public void acceptPerson(Scanner sc) {
		System.out.println("Enter the Nme:");
		name=sc.next();
		System.out.println("Enter the email:");
		email=sc.next();
		
	}
	public void displayPerson() {
		System.out.println("Name - " + name);
		System.out.println("Email - " + email);
	}
	

}
