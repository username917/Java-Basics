package EmployeeClasses;

public abstract class Employee {
	
	String name;
	int age;
	public Vehicle v;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract int getEarnings();
	
	public void printMyData() {
		
		
		
	}
	

}
