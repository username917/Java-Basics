package MehodsPackage;

//use the extends keyword to inherit all the propertie and beahviors of Vehicle class
public class Car extends Vehicle {
	
	private String modelName = "Mustang";
	
	public void myCarMethod() {
		
		//create a new car object
		Car myCar = new Car();
		
		//call the inherited Honk method of Vehicle class for my car
		myCar.honk();
		
		//display my car brand and its model
		System.out.println("My car brand is: " + myCar.brand +
				"Model: " + myCar.modelName);
				
				
	}

}
