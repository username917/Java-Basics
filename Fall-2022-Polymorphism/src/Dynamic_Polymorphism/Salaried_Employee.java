package Dynamic_Polymorphism;

public class Salaried_Employee extends calcSalary {



	@Override
	public void salaryTotalPay() {
		// TODO Auto-generated method stub
		
		netSalary = (int) (salary - (salary * 0.1));
		System.out.println("Salaried employee net pay is: " + netSalary);
		
	}



}
