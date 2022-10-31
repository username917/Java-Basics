package EmployeeApp;

public class Print extends Employee {
	
	public void printDatabase() {
		
		for(int i=0;i<empList.size();i++) {
			System.out.println();
			System.out.println("Outputting results: ");
			System.out.println(
					empList.get(i).id + " " + empList.get(i).firstName + " " + empList.get(i).lastName + " " + empList.get(i).email + " " + 
					empList.get(i).empType + " " + empList.get(i).department + " " +  empList.get(i).benefits + " " + 
					empList.get(i).make + " " + empList.get(i).model
					);
		}
		
		
	}

}
