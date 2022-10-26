package Static_Polymorphism;

public class calcSalary {
	
	static int hours = 0;
	static int wage = 0;
	static int salary = 0;
	static double commission = 0;
	static int sales = 0;
	static int netSalary = 0;
	
	public static void main (String[] args) {
		
		// calculate hourly employee
		
		wage = 20;
		hours = 35;
		calculate(wage, hours);
		System.out.println("Hourly employee wage: " + netSalary);
		
		System.out.println();
		
		// calculate salaried employee
		
		salary = 3000;
		calculate(salary);
		System.out.println("Salaried employee wage: " + netSalary);
		
		System.out.println();
		
		// calculate commission employee
		
		commission = 0.2;
		sales = 100000;
		calculate(commission, sales);
		
		System.out.println("Commissioned employee wage: " + netSalary);
		System.out.println();
		
	}
	
	static int calculate(int hours, int wage) {
		
		return netSalary = hours * wage;
		
	}
	
	static int calculate(int salary) {
		
		return netSalary = (int) (salary - (salary * 0.1));
		
	}
	
	static int calculate(double commission, int sales) {
		
		return netSalary = (int) (sales * commission);
		
	}

}
