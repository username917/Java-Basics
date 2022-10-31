package EmployeeApp;

public class Intern  extends Employee implements Vehicle, Department, Benefits   {

	@Override
	public void hasVehicle(String makeInput, String modelInput) {
		// TODO Auto-generated method stub
		make = makeInput;
		model = modelInput;
	}

	@Override
	public void hasBenefits() {
		// TODO Auto-generated method stub
		benefits = "Interns do not get benefits";
	}

	@Override
	public String hasDepartment(String dept) {
		// TODO Auto-generated method stub
		return department = dept;
	}

}
