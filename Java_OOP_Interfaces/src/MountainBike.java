class MountainBike implements Vehicle, Bicycle {
    @Override
    public void applyBreaks() {
        System.out.println("Mountain Bike stops when breaks are applied");
    }
    @Override
    public void cycle() {
        System.out.println("Has a speed of 50KMPH");
    }
}