
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for-loop
		
		int i=0;
		int j =10;
		
		for(i=0;i<=10;i++) {
			if(i==5) {
				System.out.println("Breaking out...");
				break;
			} else {
				System.out.println("The valus now is: " + i);
			}
			
		}
		
		i=0;
		j=10;
		
		//while loop
		while (i>j) {
			
			if(i>5) {
				System.out.println("I have had it with loops. Can we do something more exciting now?");
				i++;
			} else {
				break;
			}

		}
		
		if(i>j) {
			System.out.println("The condition in the while loop is true so start executing the loop.");
		} else {
			System.out.println("The condition in the while loop is false, so don't start executing.");
		}
		
		// do-while loop
		i=0;
		j=10;
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i>j);

	}

}
