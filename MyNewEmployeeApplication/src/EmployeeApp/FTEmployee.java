package EmployeeApp;

public class FTEmployee extends Employee implements Vehicle, Department, Benefits {

	@Override
	public Boolean hasVehicle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hasBenefits() {
		// TODO Auto-generated method stub
		return benefits = "Dental, drugs and therapy";
	}

	@Override
	public String hasDepartment(String dept) {
		// TODO Auto-generated method stub
		return department = dept;
	}

}