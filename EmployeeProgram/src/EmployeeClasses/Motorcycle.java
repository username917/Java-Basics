package EmployeeClasses;

public class Motorcycle extends Vehicle {
	
	public String brandWheels = "";
	
	public String getBrandWheels() {
		return brandWheels;
	}

	public void setBrandWheels(String brandWheels) {
		this.brandWheels = brandWheels;
	}

	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
		System.out.println("Make is: " + this.make);
		System.out.println("Model is " + this.model);
		System.out.println("Wheel brand is: " + this.brandWheels);
		
	}
	

}
