package myFirstPackage;

import java.util.Scanner;

public class Arrays {
	
	public void myArrayMethod() {
		// TODO Auto-generated method stub
		/*
		 * Table of Contents
		 * 
		 * index 0: Volvo
		 * index 1: BMW
		 * index 2: Ford
		 * index 3: Mazda
		 * 
		 * Length of Array = 4 items
		 * 
		 * We reference the value of i as less than the length _
		 * because the array begins at index 0 and the item )
		 * that would be the value of the length does not exist
		 * 
		 */
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		
		
		/*
		 * index 0 changes from Volvo to Opel
		 * index 1 changes from BMW to Moskvich
		 * index 2 changes from Ford to Dacia
		 * index 3 stays the same, as Mazda
		 */
		cars[0] = "Opel";
		cars[1] = "Moskvich";
		cars[2] = "Dacia";
		
		System.out.println();
		
		for(int i=0; i<cars.length; i++) {
			
			System.out.println(cars[i]);
		}
		
	}
	
	public void my2DArray() {
		
		int[][] myNumbers = {{1, 2, 3, 4},{5,6,7}};
		
		System.out.println(myNumbers[0][1]);
		
		for(int i=0; i<myNumbers.length; i++) {
			
			for(int j=0; j<myNumbers[i].length; j++) {
				
				System.out.println(myNumbers[i][j]);
				
				/*
				 * [0][0] --> 1
				 * [0][1] --> 2
				 * [0][2] --> 3
				 * [0][3] --> 4
				 * [1][0] --> 5
				 * [1][1] --> 6
				 * [1][2] --> 7
				 */
				
			}
		}
		
		
	}
	
	public void inputArray() {
		
		// this method is going to take in an array size _
		// and allow the user to enter the corresponding number _
		// of elements
		
		int sizeArray;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers in array (up to 20 items)? ");
		
		sizeArray = sc.nextInt();
		
		int[] myNumArray = new int[20];
		
		System.out.println("Enter the elements of this array: ");
		
		for(int i=0; i<sizeArray; i++) {
			
			myNumArray[i] = sc.nextInt();
			
		}
		
		System.out.println("The elements you entered are: ");
		
		for(int j=0; j<sizeArray; j++) {
			
			System.out.print(myNumArray[j] + " ");
		}
		
	}

}
