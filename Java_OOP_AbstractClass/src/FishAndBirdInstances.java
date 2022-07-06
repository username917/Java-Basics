
public class FishAndBirdInstances {
	
	public static void main(String[] args) {
		Animal myBird = new FishAndBirdPrototypes();

		myBird.label();
		myBird.move();
		myBird.eat();
	}
}

class TestFish {
	public static void main(String[] args) {
		Animal myFish = new Fish();

		myFish.label();
		myFish.move();
		myFish.eat();
	}

}
