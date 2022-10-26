import java.lang.reflect.Array;
import java.util.Arrays;

public class ParallelArrays {

	public static void main(String[] args) {
		
		String[] name = {"John", "Mary", "Ankit", "Sue", "Nicole"};
		int[] age = {21, 22, 24, 25, 20};
		int[] stuNo = {123, 234, 345, 456, 567};
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i] + " " + age[i] + " " + stuNo[i]);
		}
		
		
		
	}
}
