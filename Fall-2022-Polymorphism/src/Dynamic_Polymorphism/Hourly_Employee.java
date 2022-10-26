package Dynamic_Polymorphism;

public class Hourly_Employee extends calcSalary {

	@Override
	public void hourlyTotalPay() {
		// TODO Auto-generated method stub
		
		netSalary = hours * wage;
		System.out.println("Hourly employee net pay is: " + netSalary);
		
	}



}
