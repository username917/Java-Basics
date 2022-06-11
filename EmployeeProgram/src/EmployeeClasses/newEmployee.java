package EmployeeClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class newEmployee {
	
	public static void main(String [] args) {
		
		/*
		 * How does it work 
		 * 
		 * 1. Set up your main Employee class and then two PT and FT employee classes that will inherit it
		 * 2. Use the"estends" keywrod in the class statement to give the derived classes access to the superclass
		 * 3. We declare the employee ArrayList colleciton and a set of variables with class scope to hold input information
		 * 4. Use our traditional while-loop with an invalid input checker to prevent it executing endlessly.
		 * 5. Create an input option for FT or PT
		 * 6. Create a conditional to evaluate each choice
		 * 7. Get the inputs, specific for each employee type in the scope of the conditional
		 * 8. Declare an object of the employee type once the data are filled
		 * 
		 * IN YOUR DERIVED CLASSES:
		 * 
		 * 1. Declare the salary, bonus, hours and rate variables that are going to be unique for each employee type
		 * 2. Right click in the body of the code, choose Source --> Generate Getters and Setters
		 * 
		 * BACK IN THIS CLASS:
		 * 
		 * 1. Using your employee type object, implmenent the "set" methods for them and pass into them the input values
		 * 2. Remember, because the classes are derived, they also have access to the members and methods of the Employee class.
		 * 
		 * IMPLEMENTING GET EARNINGS
		 * 
		 * 1. We said that every employee has a unique method to calculate their earning.s
		 * 2. The problem, as I mentioned in the video, is this:
		 * 		- How do we get the ArryList object, arrEmp, which is of type Employee, to access the details of the _
		 * 		  derived classes, which exist only in them?
		 * 		- The answe is that we use abstrace methods and overriding.
		 * 3. In your Employee class, create an abstract method for getEarnings()
		 * 4. Make sure that you include the abstract keyword in the class signature.
		 * 5. Then, implement the getEarnings() method in the full time and part time employee derives classes with their specifics
		 * 6. MAKE SURE to include the "@Override" annotation at the top of each getEarnings() method in the derived classes.
		 * 
		 * NOW:
		 * 
		 * 1. Using your "earn" variable in this class, call the getEarning() method of each employee type object.
		 * 2. Set up a "totalEarned" variable in each of your derived classes and give it a getter and setter.
		 * 3. When you get the input value from calculating the total earnings, send "earn' to the "settotalEarned(int total)" _
		 * 	  method in the derived class
		 * 4. MAKE SURE to add each part time or full time employeeo object to your arrayList collection. 
		 * 5. When printing out the employee details, you will now be able to access the total earnings.
		 */
		
		ArrayList<Employee> arrEmp = new ArrayList<Employee>();
		
		String empName = "";
		int earn =0;
		int rate = 0;
		int hours = 0;
		int sal =0;
		int bonus =0;
		int age =0;
		
		
		while(empName != "na") {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter name: ");
			empName = sc.nextLine();
			
			if (empName.equals("na")) {
				break;
			}
			
			System.out.println("Enter age: ");
			age = sc.nextInt();
			
			System.out.println("Enter PT or FT = 0 for PT, 1 for FT: ");
			int opt = sc.nextInt();
			
			if(opt ==0) {
				
				System.out.println("Enter rate per hour: ");
				rate = sc.nextInt();
				
				System.out.println("Enter number of hours worked: ");
				hours = sc.nextInt();
				
				empPT newPTemp = new empPT();
				
				newPTemp.setName(empName);
				newPTemp.setAge(age);
				newPTemp.setHours(hours);
				newPTemp.setRate(rate);
				
				earn = newPTemp.getEarnings();
				
				newPTemp.setEarn(earn);
				
				newPTemp.getEarnings();
				
				arrEmp.add(newPTemp);
				//add to array
				
			}else if(opt == 1) {
				
				System.out.println("Enter salary: ");
				sal = sc.nextInt();
				
				System.out.println("Enter bonus: ");
				bonus = sc.nextInt();
				
				empFT newFTemp  = new empFT();
				
				newFTemp.setName(empName);
				newFTemp.setAge(age);
				newFTemp.setSalary(sal);
				newFTemp.setBonus(bonus);
				
				earn = newFTemp.getEarnings();
				newFTemp.setEarn(earn);
				
				arrEmp.add(newFTemp);
				
			}
		}
		
		for(int i=0;i<arrEmp.size();i++) {
			System.out.println(arrEmp.get(i).name + " " + arrEmp.get(i).age + " " + arrEmp.get(i).getEarnings());
		}
		
	}

}
