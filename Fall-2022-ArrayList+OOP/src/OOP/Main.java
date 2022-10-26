package OOP;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<StudentClass> myStuCol = new ArrayList<StudentClass>();
		
		StudentClass myStuObj = new StudentClass();
		
		Scanner sc = new Scanner(System.in);
		
		String stuName = "";
		
		while(!(stuName == "999")) {
			
			System.out.println("Enter student name: ");
			stuName = sc.nextLine();
			
			if(stuName.equals("999")) {
				break;
			} else {
				myStuObj.name = stuName;
			}
			
			System.out.println("Enter student age: ");
			myStuObj.age = sc.nextInt();
			
			System.out.println("Enter student ID: ");
			myStuObj.stuNo = sc.nextInt();
			
			System.out.println("Is the student studying? 1 for yes, 0 for no: ");
			myStuObj.study = sc.nextInt();
			
			if(myStuObj.study == 1) {
				myStuObj.studying();
			} else {
				myStuObj.notStudy();
			}
			
			myStuCol.add(myStuObj);
			
			sc.nextLine();
		
		}
		
		try {
			for(int i=0; i<myStuCol.size(); i++) {
				System.out.println();
				System.out.println("Outputting student collection: ");
				System.out.println(myStuCol.get(i).name + " " + myStuCol.get(i).age + " " + myStuCol.get(i).stuNo + myStuCol.get(i).activity);
			}	
		} catch (Exception e) {
			System.out.println("Error is: " + e);
		}
			
	}

}
