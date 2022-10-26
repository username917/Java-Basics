import java.util.Scanner;
import java.util.Arrays;

public class InClassLoopsArrays {
	
	// 1. Get an input for a student name
	// 2. assign a student number to each student
	// 3. a 2D array will hold name in one subset, and a student number in the second subset
	// 		each input cycle populates the array
	// 4. we are going to display 5 students and 5 student numbers
	
	public static void main(String[] args ) {
		
		int num = 5;
		int i =0;
		Scanner sc = new Scanner(System.in);
		String studentNumber = "ABC";
		
		String[][] arrStudents = new String[2][5];
		
		do {
			
			System.out.println("Enter student name " + i + 1);
			String student = sc.nextLine();
			
			if(!student.equals("")){
				
				arrStudents[0][i] = student;
				arrStudents[1][i] = studentNumber + "00" + i + 1;
				
			} else {
				
				System.out.println("Please enter a student.");
			}
			
			i++;
			
		} while (i < 5);
		
		//outputting the 2D array as a string in one line
		System.out.println(Arrays.deepToString(arrStudents));
		
		//outputting he 2D array as a set of nested loops
		
		String[] collArr = new String[5];
		
		
		for(int t=0; t<5; t++) {
			
			collArr[t] = arrStudents[0][t];
			collArr[t] = collArr[t] + " " + arrStudents[1][t];
			System.out.println(collArr[t]);
		}
		
		
		
		// going through the outer loop for the array
		for(int j=0; j<arrStudents.length; j++) {
			
			// going through the inner loop for each collection in the array
			for(int k=0; k<arrStudents[j].length; k++) {
				
				System.out.println();
				
				System.out.println(arrStudents[j][k]);
				
			}
			
		}
		
		
		
	}
	


}
