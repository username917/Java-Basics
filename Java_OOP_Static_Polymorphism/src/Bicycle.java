class Bicycle {
    public void cycle() {
        System.out.println("The Bicycle is cycling.");
    }

    public void cycle(double speed) {
        System.out.println("The Bicycle is cycling at " + speed + " kilometers per hour.");
    }
    public void cycle(String name, double speed) {
        System.out.println("The " + name + " is cycling " + speed + " kilometers per hour.");
    }
}