import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 1. Import the ArrayList object from the java.util class
		 * 2. 	
		 */
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Ford");
		cars.add("Ambassador");
		cars.add("Renault");
		cars.add("Tesla is not a real car");
		
		Collections.sort(cars);
		
		//looping
		cars.forEach(n -> System.out.println(n));
		
		for(String carBrand : cars) {
			System.out.println(carBrand);
		}
		
		System.out.println();
		
		System.out.println(cars);
		System.out.println();
		
		//get method
		String recallCar = cars.get(1);
		System.out.println(recallCar);
		
		//set method
		cars.set(3, "Tesla is, in fact, a real car.");
		
		System.out.println(cars);
		System.out.println();
		
		cars.remove(1);
		System.out.println(cars);
		System.out.println();
		
		//size method
		int n = cars.size();
		System.out.println("The array list has " + n + " elements");
		
		//clear
		cars.clear();
	}

}
