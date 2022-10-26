package Dynamic_Polymorphism;

public class Intern extends calcSalary{
	
	public void internTotalPay() {
		
		netSalary = wage * internHours;
		System.out.println("Interns get paid? HA! Pay is " + netSalary);
	};

}
