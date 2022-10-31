package EmployeeApp;

public class FTEmployee extends Employee implements Vehicle, Department, Benefits  {

	@Override
	public void hasVehicle(String makeInput, String modelInput) {
	
		// TODO Auto-generated method stub
		this.make = makeInput;
		this.model = modelInput;
		
	}

	@Override
	public void hasBenefits() {
		
		// TODO Auto-generated method stub
		benefits = "Dental, drugs and therapy";
	}

	@Override
	public String hasDepartment(String dept) {
		
		// TODO Auto-generated method stub
		return this.department = dept;
	}

}
