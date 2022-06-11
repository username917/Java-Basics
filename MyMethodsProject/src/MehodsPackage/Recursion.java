package MehodsPackage;

public class Recursion {
	
	//the idea is to add a range of numbers together 
	
	public void startMe() {
		
		int result = sum(10);
		System.out.println(result);
	}

	public int sum(int k) {
		
		if(k>0) {
			return k + sum(k -1);
		} else {
			return 0;
		}
	}
}
