
public class FishAndBirdPrototypes extends Animal {
	
	void move() {
		 System.out.println("Moves by flying.");
    }
	void eat() {
		 System.out.println("Eats bird food.");
	}	 
}


class Fish extends Animal {
	
		 void move() {
			 System.out.println("Moves by swimming.");
	     }
		 void eat() {
			 System.out.println("Eats seafood.");
		 }

}
