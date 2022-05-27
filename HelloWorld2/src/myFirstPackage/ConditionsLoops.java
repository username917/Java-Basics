package myFirstPackage;
import java.util.Scanner;

public class ConditionsAndLoops {
	
	public void LoopMe () {
		
		//int i=0;
		
		//For loop with a break statement
		for(int i=0; i<5; i++) {
			
			System.out.println("The number is: " + i);
			
			if(i==4) {
				System.out.println("Breaking out of the loop at i=" + i + "!");
				break;
			}
		}
		
		//for loop with a continue statement
		for(int i=0; i<5; i++) {
			
			System.out.println("The number is: " + i);
			
			if(i==10) {
				System.out.println("Continuing the loop at i=" + i + "!");
			} else if (i ==3) {
				System.out.println("Continuing the loop at i=" + i + "!");
				continue;
			} else if (i ==8) {
				System.out.println("i is " + i);
			}
		}
		
		
		//while loop
		int j = 0;
		
		while(j<5) {
			
			System.out.println("My while loop number is: " + j);
			j = j + 1; //j++
			
		}
		
		
		//do-while loop
		int k = 1;
		
		do {
			
			if(k == 8) {
				System.out.println("My do-while number is: " + k);
				break;
			}
			
			k++;
			
			
		} while (k<10);
		
	}
	
	

}
