package EmployeeClasses;

public class Car extends Vehicle {
	
	public String brandEngine = "";
	
	
	public String getBrandEngine() {
		return brandEngine;
	}


	public void setBrandEngine(String brandEngine) {
		this.brandEngine = brandEngine;
	}


	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
		System.out.println("Make is: " + this.make);
		System.out.println("Model is: " + this.model);
		System.out.println("Engine brand is: " + this.brandEngine);
		
	}
	

}
