package EmployeeApp;

import java.util.Scanner;
import java.util.ArrayList;

public class Input {

	public void getInput() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		
		FTEmployee FT = new FTEmployee();
		PTEmployee PT = new PTEmployee();
		Contractor contractor = new Contractor();
		Intern intern = new Intern();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id: ");
		
		System.out.println("Enter employee first name: ");
		
		System.out.println("Enter employee last name: ");
		
		System.out.println("enter email: ");
		
		System.out.println("Enter department");
		
		
		System.out.println("Enter employee type: 1 - FT, 2 - PT, 3 - Contractor, 4 - Intern");
		int type = sc.nextInt();
		
		String dept = "";
		
		switch(type) {
		
		case 1:
			
			emp.setempType("FT");
			FT.hasBenefits();
			emp.getbenefits();
			
			System.out.println("Enter department: ");
			dept = sc.nextLine();
			
			FT.hasDepartment(dept);
			emp.getdepartment();
			
		case 2:
			
			emp.setempType("PT");
			PT.hasBenefits();
			emp.getbenefits();
			
			System.out.println("Enter department: ");
			dept = sc.nextLine();
			
			PT.hasDepartment(dept);
			emp.getdepartment();
		
		case 3:
			
			emp.setempType("Contractor");
			contractor.hasBenefits();
			emp.getbenefits();
			
			System.out.println("Enter department: ");
			dept = sc.nextLine();
			
			contractor.hasDepartment(dept);
			emp.getdepartment();
		
		case 4:
			
			emp.setempType("Intern");
			intern.hasBenefits();
			emp.getbenefits();
			
			System.out.println("Enter department: ");
			dept = sc.nextLine();
			
			intern.hasDepartment(dept);
			emp.getdepartment();
		}
		
		
		System.out.println("Does have employee have benefits? 1 - Yes, 0 - No:");
		int benefits = sc.nextInt();
		
		switch(type) {
		
		case 0:
			
		
		
		case 1:
			
		}
		
		
		
		System.out.println("Does the employe"
				+ " e have a car? 1 - Yes, 0 - No:");
		int hasCar = sc.nextInt();
		
		
	}

	//in this class, we are going to get all the inputs we need for the application
}