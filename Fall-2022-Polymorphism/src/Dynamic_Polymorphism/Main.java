package Dynamic_Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int hours = 20;
		
		// hourly employee
		Hourly_Employee lowWageSlave = new Hourly_Employee();
		
		lowWageSlave.hours = 20;
		lowWageSlave.wage = 15;
		lowWageSlave.hourlyTotalPay();
		
		// salaried employee 
		Salaried_Employee overWorkedTired = new Salaried_Employee();
		
		overWorkedTired.salary = 3000;
		overWorkedTired.salaryTotalPay();
		
		//commissioned employee
		Commissioned_Employee pyramidScheme = new Commissioned_Employee();
		
		pyramidScheme.commission = 0.2;
		pyramidScheme.sales = 100000;
		pyramidScheme.commissionTotalPay();
		
		//intern
		
		Intern freeLabor = new Intern();
		freeLabor.wage = 0;
		freeLabor.internTotalPay();

	}

}
