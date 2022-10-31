package EmployeeApp;

import java.math.BigInteger;

public class Employee extends Input {
	
	protected BigInteger id;
	protected String firstName;
	protected String lastName;
	protected String empType;
	protected String email;
	
	protected String make;
	protected String model;
	
	protected String benefits;
	protected String department;
	
//	public String getMake() {
//		return make;
//	}
//	public void setMake(String make) {
//		this.make = make;
//	}
//	public String getModel() {
//		return model;
//	}
//	public void setModel(String model) {
//		this.model = model;
//	}
//	public String getBenefits() {
//		return benefits;
//	}
//	public void setBenefits(String benefits) {
//		this.benefits = benefits;
//	}
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
	

}
