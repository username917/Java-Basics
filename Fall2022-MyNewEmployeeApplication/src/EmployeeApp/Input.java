package EmployeeApp;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;

public class Input {
	
		//in this class, we are going to get all the inputs we need for the application
	
		int type = 0;
		String check = "";
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Scanner sc = new Scanner(System.in);
	
		public void cycleInputs() {
			
			BigInteger empId;
			
			do {
				
				Employee emp = new Employee();
				
				FTEmployee FT = new FTEmployee();
				PTEmployee PT = new PTEmployee();
				Contractor contractor = new Contractor();
				Intern intern = new Intern();
				
				System.out.println("Enter employee id: ");
				empId = sc.nextBigInteger();
				emp.setId(empId);
				
				check = empId.toString();
				
				if(!check.equals("999")) {
					getInputs(FT, PT, contractor, intern, emp);
					empList.add(emp);
				} else {
					System.out.println();
					displayEmployees();
					System.out.println();
					usePrintClassToDisplayDatabse();
					System.out.println("Goodbye!");
					break;
				}

			} while(!check.equals("999"));
		}

		public void getInputs(FTEmployee FT, PTEmployee PT, Contractor contractor, Intern intern, Employee emp) {
		
			String input = "";
			
			System.out.println("Enter employee first name: ");
			
			input = sc.nextLine();
			emp.setFirstName(input);
			sc.nextLine();
						
			System.out.println("Enter employee last name: ");
			input = sc.nextLine();
			emp.setLastName(input);
			
			System.out.println("Enter email: ");
			input = sc.nextLine();
			emp.setEmail(input);
						
			System.out.println("Enter employee type: 1 - FT, 2 - PT, 3 - Contractor, 4 - Intern: ");
			type = sc.nextInt();
			sc.nextLine();
			
			String dept = "", empType="";
			
			switch(type) {
			
				case 1:
					
					emp.setEmpType("FT");
					empType = "FT";
					
					FT.hasBenefits();
					emp.benefits = FT.benefits;
					
					System.out.println("Enter department: ");
					dept = sc.nextLine();
					
					FT.hasDepartment(dept);
					emp.department = FT.department;
					
					getVehicle(FT, PT, contractor, intern, empType, emp);
					break;
					
				case 2:
					
					emp.setEmpType("PT");
					empType = "PT";
					
					PT.hasBenefits();
					emp.benefits = PT.benefits;
					
					System.out.println("Enter department: ");
					dept = sc.nextLine();
					
					PT.hasDepartment(dept);
					emp.department = PT.department;
					
					getVehicle(FT, PT, contractor, intern, empType, emp);
					break;
				
				case 3:
					
					emp.setEmpType("Contractor");
					empType = "Contractor";
					
					contractor.hasBenefits();
					emp.benefits = contractor.benefits;
					
					System.out.println("Enter department: ");
					dept = sc.nextLine();
					
					contractor.hasDepartment(dept);
					emp.department = contractor.department;
					
					getVehicle(FT, PT, contractor, intern, empType, emp);
					break;
					
				case 4:
					
					emp.setEmpType("Intern");
					empType = "Intern";
					
					intern.hasBenefits();
					emp.benefits = intern.benefits;
					
					System.out.println("Enter department: ");
					dept = sc.nextLine();
					
					intern.hasDepartment(dept);
					emp.department = intern.department;
					
					getVehicle(FT, PT, contractor, intern, empType, emp);
					break;
				
			}
		
		}
		
		public void getVehicle(FTEmployee FT, PTEmployee PT, Contractor contractor, Intern intern, String empType, Employee emp) {
			
			System.out.println("Does the employee have a car? 1 - Yes, 0 - No");
			int hasCar = sc.nextInt();
			sc.nextLine();
			
			switch(type) {
			
				case 0:
					
					System.out.println("No vehicle to enter");
					
					switch(empType) {
					
						case ("FT"):
							
							FT.hasVehicle("", "");
							break;
							
						case ("PT"):
							
							PT.hasVehicle("", "");
							break;
							
						case ("Contractor"):
							
							contractor.hasVehicle("", "");
							break;
							
						case ("Intern"):
					
							intern.hasVehicle("", "");
							break;
					
					}
					
				case 1:
					
					System.out.println("Enter car make: ");
					String make = sc.nextLine();	
					
					System.out.println("Enter car model: ");
					String model = sc.nextLine();
										
					switch(empType) {
					
					case ("FT"):
						
						FT.hasVehicle(make, model);
						emp.make = FT.make;
						emp.model = FT.model;
						break;
						
					case ("PT"):
						
						PT.hasVehicle(make, model);
						emp.make = PT.make;
						emp.model = PT.model;
						break;
						
					case ("Contractor"):
						
						contractor.hasVehicle(make, model);
						emp.make = contractor.make;
						emp.model = contractor.model;
						break;
						
					case ("Intern"):
						
						intern.hasVehicle(make, model);
						emp.make = intern.make;
						emp.model = intern.model;
						break;
					}
			}
			
		}
		
		private void displayEmployees() {
			// TODO Auto-generated method stub
			for(int i=0;i<empList.size();i++) {
				System.out.println();
				System.out.println("Outputting results: ");
				System.out.println(
						empList.get(i).id + " " + empList.get(i).firstName + " " + empList.get(i).lastName + " " + empList.get(i).email + " " + 
						empList.get(i).empType + " " + empList.get(i).department + " " +  empList.get(i).benefits + " " + 
						empList.get(i).make + " " + empList.get(i).model
						);
			}
			
		}
		
		private void usePrintClassToDisplayDatabse() {
			
			Print printMe = new Print();
			printMe.printDatabase();
		}

}
