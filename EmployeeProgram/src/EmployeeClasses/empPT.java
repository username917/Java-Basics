package EmployeeClasses;

import java.util.Objects;

public class empPT extends Employee{
	
	int hours = 0;
	int rate = 0;
	int earn=0;
			;
	public int getEarn() {
		return earn;
	}
	public void setEarn(int earn) {
		this.earn = earn;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	@Override
	public int getEarnings() {
		return rate * hours;
		
	}
	
	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Earnigs: " + this.earn);
		
		System.out.println(Objects.nonNull(m.brandWheels));
		if(m.brandWheels.equals("")) {
			c.printMyData();
		} else {
			m.printMyData();
		}
		
	}

}
