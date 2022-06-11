package MehodsPackage;

public class mainClass {
	
	static int age = 0;
	public static void main(String[] args) {
		
		//make some variables and pass them around
		String name = ""; int a=0;  int b=0;  
		
		a=5;  b=3; 
		name ="Ansu"; 
	  
		System.out.println(addMe(name, a, b));
	  
		checkAge(17); 
		
		myMethod();
	  
		System.out.println(multiplyMe(4,5));
	  
		//for the sake of an example, Newton's second law - Force = mass *acceleration
		System.out.println(multiplyMe(5));
	  
		//recursion - example of a function calling itself; generally more efficient than a loop
		Recursion startUp = new Recursion();  startUp.startMe();
		 		
		//basic example of inheritance
		Car newCar = new Car();
		newCar.myCarMethod();

	}
	
	public static void checkAge (int age) {
		
		// checking if you have the right to vote
		
		// if age is less than 18, you don't have the right to vote
		if (age< 18) {
			
			System.out.println("You cannot vote");
			
		} else {
			
			// if age is over 18, you can vote
			System.out.println("You can vote");
		}
		
	}
	

	public static void myMethod() {
		
		System.out.println("I just got executed.");
		
	}
	
	public static int addMe(String name, int a, int b) {
		
		System.out.println("My name is: " + name + "my favorite number is: " + (a +b));
		
		return a + b;
		
	}
	
	static int multiplyMe(int a, int b) {
		
		System.out.println(age);
		
		return a*b;
	}
	
	static double multiplyMe(double x) {
		
		return 9.81 * x;
	}

}
