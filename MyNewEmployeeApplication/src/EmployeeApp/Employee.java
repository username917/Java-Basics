package EmployeeApp;

import java.math.BigInteger;

public class Employee {
	
	private BigInteger id;
	private String firstName;
	private String lastName;
	private String empType;
	private String email;
	protected String department;
	
	protected String make;
	protected String model;
	
	public String benefits;
	
	
	public BigInteger getID() {
		return id;
	}
	public void setID(BigInteger id) {
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
	public String getempType() {
		return empType;
	}
	public void setempType(String empType) {
		this.empType = empType;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getdepartment() {
		return department;
	}
	public void setdepartment(String department) {
		this.department = department;
	}
	public String getmake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getmodel() {
		return model;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getbenefits() {
		return benefits;
	}
	public void getbenefits(String benefits) {
		this.benefits = benefits;
	}

}