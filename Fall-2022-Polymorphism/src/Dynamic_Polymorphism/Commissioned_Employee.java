package Dynamic_Polymorphism;

public class Commissioned_Employee extends calcSalary {

	@Override
	public void commissionTotalPay() {
		// TODO Auto-generated method stub
		
		netSalary = (int) (sales * commission);
		System.out.println("Commissioned employee net pay is: " + netSalary);
		
	}

}
