package Employee;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		
		
		ExtendImplementEmployee employee1 = new ExtendImplementEmployee();
		
		employee1.setEmployeeID();
		
		System.out.print("What is your name: ");
		String name = input.nextLine();
		employee1.setEmployeeName(name);
		
		System.out.print("Which location you are applying for: ");
		String location = input.nextLine();
		employee1.setEmployeeLocation(location);
	
		
		System.out.print("What is the possition you are applying for. \nAvailable possitions are "
				+ " CEO, Tester, Developer, and BA : ");
		String pos = input.nextLine();
		
		employee1.setEmployeePosition(pos);
		try {
		System.out.println("Desired starting salary: ");
		double salary = input.nextDouble();
		employee1.setEmployeeSalary(salary);
		} catch (Exception ex) {
			System.out.println("You vahe to enter numerical sumbols for desired salary");
		}
		System.out.println("Name:" + employee1.getEmployeeName() 
		+ ", Location: " + employee1.getEmployeeLocation()
		+", Applying for: " + employee1.getEmployeePosition()
		+", Desired salary " + employee1.getEmployeeSalary());
		
		System.out.println(employee1.employeeDuties(pos));
		System.out.println("Your employee ID will be: " + employee1.getEmployeeID());
		
		System.out.print("If you sign a contract for 5 years we will raise you salary by 10% each year"
				+ " Yes/No : ");
		
		String answer;
		Scanner y = new Scanner(System.in);
		answer = y.nextLine();
		
		
		 if (new String(answer).equals("yes") || new String(answer).equals("Yes")){
			 
			 System.out.println("Your salary for the " + 1 + " year will be "
				 + employee1.getEmployeeSalary());
				 for (int i = 2 ; i<= 5 ; i++){
					 System.out.println("Your salary for the " + i + " year will be "
							 + employee1.raiseSalary(10));
				 	}
		 }
		 else System.out.println("5 year contract not accepted!");
		 
		 System.out.println("Your application was accepted!");
		 	  
			}
	}

	
	

