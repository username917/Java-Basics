package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class newStudent {
	
	//the code to create a new instance of a student with data.
	
	public static void main(String [] args) {
		
		String name="";
		
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
			
			// assigns the value of the scanner input variable_
			// to the "name" attribute of my classStudent object, 
			// which is newStudent
			newStudent.name = name;
			
			System.out.println();
			System.out.println("Enter your age: ");
			newStudent.age = sc.nextInt();
			
			System.out.println();
			System.out.println("Enter your favorite color: ");
			newStudent.color = sc.nextLine();
			
			colStudents.add(newStudent);
			
			sc.nextLine();
			
		}
		
		System.out.println(colStudents.size());
		
		for(int i=0; i<colStudents.size(); i++) {
			
			System.out.println("Name: " + colStudents.get(i).name);
			System.out.println("Age: " + colStudents.get(i).age);
			System.out.println("Fave Color: " + colStudents.get(i).color);
		}
		
				
		
		
	}

}
