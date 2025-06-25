package pratices;

import java.util.Scanner;

public class Vehicle {
	String name;
	String  number;
	
	public Vehicle() {
		
	}
	public void acceptVehicle(Scanner sc) {
		System.out.print("Enter the Name:");
		name=sc.next();
		System.out.print("Enter the Number:");
		number=sc.next();
		}
	
	public void displayVehicle() {
		System.out.println("Vehicle name - " + name);
		System.out.println("Vehicle number - " + number);
		
	}
}
