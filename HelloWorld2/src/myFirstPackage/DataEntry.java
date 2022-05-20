package myFirstPackage;

import java.util.Scanner;

public class DataEntry {

	public void InputData() {

		// declare an object of Scanner type to get input from user
		Scanner sc = new Scanner(System.in);

		// get the prompt to enter name
		System.out.println("Enter your name: ");

		// assign the value of the input into a String variable
		String myName = sc.nextLine();
		// System.out.println(myName);

		// get my age
		System.out.println("Enter your age: ");

		// assign the value of the input into an Integer variable
		Integer myAge = sc.nextInt();
		
		// output the name
		 System.out.println("My name is " + myName + ", and my age is " + myAge);

		//if-else if conditional statement
		 if(myAge >= 18 && myAge>=21) {
			 System.out.println("You can drink and drive if your BAC is below 0.5!"); }
		 else if(myAge>18 && myAge < 21) {
			 System.out.println("You can drive, but not drink!"); } 
		 else if(myAge == 18) {
			 System.out.println("You cannot drink, but you can drive!"); } 
		 else if (myAge> 16 && myAge< 18) {
			 System.out.println("You cannot drink and cannot drive!"); } 
		 else {
			 System.out.println("Enter a value more than 16!"); }

	}

	public void MySides() {

		Scanner sc = new Scanner(System.in);

		// get the prompt to enter selection
		System.out.println("Enter a selection - enter 1 for fries, and 2 for salad: ");

		// assign the value of the input into a String variable
		Integer mySelection = sc.nextInt();
		
		
		//go through the various menu options with a switch statement
		switch (mySelection) {

		case 1:
			System.out.println("You ordered fries!");
			break;

		case 2:
			System.out.println("You ordered salad!");
			break;

		default:
			System.out.println("You must pick between fries or salad!");

		}

	}

	//use a switch statement with its alternative syntax.
	public void DayDate() {

		Scanner sc = new Scanner(System.in);

		// get the prompt to enter selection
		System.out.println("Enter a day: ");

		// assign the value of the input into a String variable
		String myDay = sc.nextLine();
		// System.out.println(myName);
		
		switch(myDay) {
		
		//note the use of the arrow and the braces that enclose the action to be completed, like in an if statement
		case "Sat", "Sun"-> {
			System.out.println("We are closed today!"); 
			break; 
			}
		
		case "Mon", "Tues", "Wed", "Thurs", "Fri"-> {
			System.out.println("We are open");
			break;
			}
		default-> {
			System.out.println("You have to enter a day of the week!");
			}
		
		}

	}

}
