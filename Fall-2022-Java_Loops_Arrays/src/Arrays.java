import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Mazda", "Volvo", "BMW", "Ford"};
		
		int x = cars.length;
		
		System.out.println("The length of the Cars array is: " + x);
		
		// looping through the contents with a for-loop
		
		for(int i=cars.length -1; i>=0; i--) {
			System.out.println(cars[i]);
		}
		
		
		System.out.println();
		
		// while loop
		int i=0; 
		
		while (i<cars.length) { 
			System.out.println(cars[i]); 
			i++;
		}
		
		System.out.println();
		
		// do while loop
		
		i = cars.length - 1;
		
		do {
			
			System.out.println("Printing in reverse:");
			System.out.println(cars[i]);
			i--;
			
		} while (i>=0);
		
		System.out.println();
		
		// populating an array dynamically, not statically
		
		int[] myNumArray = new int[10];
		
		for(int k=0; k<10; k++) {
			myNumArray[k] = k+1;
		}
		
		for(int m=0; m<10; m++) {
			System.out.println(myNumArray[m]);
		}
		
		/*
		 * int[] numArr2 = {1, 2, 3, 4, 5}; String[] myStringArr =
		 * Arrays.toString(numArr2);
		 */
		
		System.out.println();
		
		// multidimensional array
		
		int[][] arr2D = {{1, 2, 3, 4, 5},{2, 4, 6, 8, 10}};
		
		/*
		 * System.out.println(arr2D[0][0]); System.out.println(arr2D[0][1]);
		 * System.out.println(arr2D[0][2]); System.out.println(arr2D[0][3]);
		 * System.out.println(arr2D[0][4]); System.out.println(arr2D[1][1]);
		 * System.out.println(arr2D[1][2]); System.out.println(arr2D[1][3]);
		 * System.out.println(arr2D[1][4]);
		 */
		
		
		for (int a = 0; a < arr2D.length; ++a) {
			
	         for(int b = 0; b < arr2D[a].length; ++b) {
	        	 
	                   System.out.println(arr2D[a][b]);
	      		}
		}
		 



		
		/*
		 * {first collection}
		 * 	{second collection}
		 * 		
		 */

		
		
		
		
		 

	}



}
