package EmployeeClasses;

public class empFT extends Employee{
	
	int salary=0;
	int bonus=0;
	int earn=0;
	
	public int getEarn() {
		return earn;
	}
	public void setEarn(int earn) {
		this.earn = earn;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public int getEarnings() {
		return salary + bonus;
		
	}
	
	public void printMyData() {
		
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Earnings: " + this.earn);
		
		if(m.brandWheels.equals("")) {
			c.printMyData();
		} else {
			m.printMyData();
		}
		
	}
}
