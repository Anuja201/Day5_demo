package pratices_demo2;

import java.util.Scanner;

public class Emplyoee extends Person {
	int empid;
	double salary;
	
	public Emplyoee() {
		System.out.println("Employee()");
	}

	public Emplyoee(String name, String email, int empid, double salary) {
		super(name, email);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void acceptEmployee(Scanner sc ) {
		System.out.println("Enter the empid:");
		empid=sc.nextInt();
		acceptPerson(sc);
		System.out.println("Enter the salary:");
		salary=sc.nextDouble();
	}
	
	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		displayPerson();
		System.out.println("Salary - " + salary);
		
	}

}
