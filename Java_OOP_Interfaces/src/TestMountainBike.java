class TestMountainBike {
    public static void main(String[] args) {
        MountainBike mBike = new MountainBike();
        mBike.applyBreaks();
        mBike.cycle();
        System.out.println("Number of wheels: " + Bicycle.wheels);
    }
}