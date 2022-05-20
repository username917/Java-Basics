package myFirstPackage;

public class VariablesAndOutput {
	
	void AccessVariables() {
		
		
		String firstName = "FName";
		String lastName = "LName";
		String name = firstName + lastName;
		String rdmString = "1234fsgfgfg*&^*&^&*^**";
				
		//integers for demonstrations
		Integer myNum = 5;
		Integer myOtherNum =7;
		Integer mySum;
		
		int x = 5, y = 7, z=15;
		int a, b, c; a = b = c = 50;
		
		byte myByte = (byte) 180;
		short myShort = 5000;
		long myLong = 1500000000000L;
		float myFloat = 5.753f;
		double myDouble = 19.99d;
		
		Double sumTotal;
		
		boolean isItCorrect = false;
		char myGrade = 65;
		
		//this code uses the println method of the PrintStream class to output a name and student number
		System.out.println("Hello World, my name " + firstName + " " + lastName);
		System.out.println("Student ID: 123456789.");
		System.out.println();
		
		System.out.println("Now calcualting a sum....");
		
		System.out.println("The sum is " + (myNum + myOtherNum));
		
		System.out.println();
		System.out.println(x + y + z);
		System.out.println(a + b + c);
		
		System.out.println();
		System.out.println(myByte + ", " + myShort + ", " + myLong + ", " + myFloat + ", " + myDouble);
		
		System.out.println(isItCorrect + ", " + myGrade + ", " + rdmString);
		
		sumTotal = myFloat + myNum + myDouble;
		System.out.println(sumTotal);
		
		//Casting declarations and examples
		
		int myOtherOtherInt = 9;
		double myOtherOtherDouble = myOtherOtherInt; 
		
		System.out.println();
		System.out.println("Widening Casting...");
		System.out.println(myOtherOtherInt);
		System.out.println(myOtherOtherDouble);
		
		//narrowing casting
		
		double myWideDouble = 9.78d; 
		int myNarrowInt = (int) myWideDouble;
		
		System.out.println();
		System.out.println("Narrowing Casting...");
		System.out.println(myWideDouble);
		System.out.println(myNarrowInt);
		
		//operations
		
		int sum1 = 100 + 50;
		int sum2 = sum1 + 250;
		int sum3 = sum2 + sum2;
		
		System.out.println();
		System.out.println("Operations");
		System.out.println(sum1 + ", " + sum2 + ", " + sum3);
		
		//casting during an operation
		//int z = "100" + "50"; //this is a mismatched, illegal operation, because the var types are not compatible.
		
		System.out.println();
		System.out.println("Casting with Opertions");
		int myParsedInt = Integer.parseInt("100") + Integer.parseInt("50");
		System.out.println(myParsedInt); 
		
	}

}
