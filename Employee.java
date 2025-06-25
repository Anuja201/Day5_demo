package pratices;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	Date doj;
	Vehicle veh;
	
	public Employee() {
		System.out.println("Employee()");
	}
	public Employee(int empid, String name, double salary,int day ,int month,int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		doj=new Date(day,month,year);
	}
	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter the employeeid:");
		empid=sc.nextInt();
		System.out.print("Enter the Name:");
		name=sc.next();
		System.out.print("Enter the Salary:");
		salary=sc.nextDouble();
		System.out.println("Enter the day of joining-");
		doj.acceptDate(sc);
	}
	
	public void addVehicle(Scanner sc) {
		veh =new Vehicle();
		veh.acceptVehicle(sc);
		
	}
	
	public void displayEmployee() {
		System.out.println("empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
		System.out.println("day of joining - ");
		doj.displayDate();
		if(veh != null)
			veh.displayVehicle();
	}
	

}
