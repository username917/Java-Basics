package myFirstOOPPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
	
	public void ArrayLists() {
		
		ParallelArrays students = new ParallelArrays();
		students.studentAgeColor();
		
		
		//declaring an array
		//String [] cars = {};
		
		//declare an array list - this is a Constructor
		//the job of a constructor is to initiate an object of a class
		
		  ArrayList<String> cars = new ArrayList<String>();
		  
		  cars.add("Volvo"); 
		  cars.add("BMW"); 
		  cars.add("Ford"); 
		  cars.add("Mazda");
		  
		  System.out.println(cars.get(0));
		  
		  cars.set(0, "Opel");
		  
		  System.out.println(cars);
		  
		  cars.remove(3);
		  
		  System.out.println(cars);
		  
		  System.out.println("The size of the ArrayList cars is: " + cars.size());
		  
		  System.out.println();
		  
		  for(int i=0; i<cars.size(); i++) { System.out.println(cars.get(i)); }
		  
		  System.out.println();
		  
		  for(String i: cars) { System.out.println(i); }
		  
		  Collections.sort(cars);
		  
		  System.out.println(cars);
		  
		  
		 
		
	}
	
	public static void integerArrayList() {
		
		//build an arryalist of integers, output it and change one item
		
		  ArrayList<Integer> intList = new ArrayList<Integer>();
		  
		  intList.add(1); intList.add(2); intList.add(3); intList.add(4);
		  intList.add(5);
		  
		  System.out.println(intList);
		  
		  //changing an item in the arraylist
		  
		  intList.set(0, 6);
		  
		  System.out.println(intList);
		
	}

}
