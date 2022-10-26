package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class newStudent {
	
	//the code to create a new instance of a student with data.
	
	public static void main(String [] args) {
		
		String name="";
		int age=0;
		String color="";
		
		// an array list to hold out students
		ArrayList<classStudent> colStudents = new ArrayList<classStudent>();
		
		// initiate an object of classStudet type to hold values for _
		// each time I create a new student
		classStudent newStudent = new classStudent();
		
		// declare an initiate a Scanner object to hold name, age and color _
		// values
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 1. Ask for a name
		 * 2. Ask for an age
		 * 3. Ask for color
		 * 4. The program to keep cycling until told otherwise
		 * 
		 * To achieve this, we will use a while loop
		 * 
		 */
		
		while(name != "9999" ) {
			
			System.out.println("Enter your name: ");
			name = sc.nextLine();
			
			if(name.equals("9999")) {
				break;
			}
			
			
			System.out.println();
			System.out.println("Enter your age: ");
			age = sc.nextInt();
			
			System.out.println();
			System.out.println("Enter your favorite color: ");
			color = sc.nextLine();
			
			int status=0;
			System.out.println("Are you FT or PT (1 or 0): ");
			status = sc.nextInt();
			
			if(status==0) {
				
				System.out.println("Enter number of courses (less than 5:) ");
				int numCourses = sc.nextInt();
				
				partTimeStudent newStud = new partTimeStudent();
				
				newStud.courses(numCourses);
				newStud.name = name;
				newStud.calcYearBorn(age);
				newStud.color = color;
				
				colStudents.add(newStudent);	
				
			} else if (status ==1) {
				
				System.out.println("Enter number of courses (more than 5:) ");
				int numCourses = sc.nextInt();
				
				fullTimeStudent newStud = new fullTimeStudent();
				
				newStud.courses(numCourses);
				newStud.name = name;
				newStud.calcYearBorn(age);
				newStud.color = color;
				
				colStudents.add(newStudent);	
			}
			
			
			
			sc.nextLine();
			
		}
		
		System.out.println(colStudents.size());
		
		for(int i=0; i<colStudents.size(); i++) {
			
			System.out.println("Name: " + colStudents.get(i).name);
			System.out.println("Age: " + colStudents.get(i).age);
			System.out.println("Fave Color: " + colStudents.get(i).color);
			System.out.println("Fave Color: " + colStudents.get(i).color);
		}
		
				
		
		
	}

}