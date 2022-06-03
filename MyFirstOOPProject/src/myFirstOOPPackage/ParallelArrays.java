package myFirstOOPPackage;

import java.util.Arrays;

public class ParallelArrays {
	
	public void studentAgeColor() {
		
		String[] name = {"Ansu", "Deep", "Heemiha", "Janhvi", "Kripa"};
		
		Integer[] age = {22, 24, 27, 25, 20};
		
		String[] color = {"black", "blue", "pink", "grey", "red"};
		
		//associate each name with an age and a color
		
		for(int i=0; i<5; i++) {
			System.out.println(name[i] + " " + age[i] + " " + color[i]);
		}
		
	}

}
