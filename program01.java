package pratices_demo2;

import java.util.Scanner;


public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Emplyoee e1= new Emplyoee("mimeo@gmail.com","miemo",1,20000);
		e1.displayEmployee();
		
		Emplyoee e2= new Emplyoee();
		e2.acceptEmployee(sc);
		e2.displayEmployee();

	}

}
