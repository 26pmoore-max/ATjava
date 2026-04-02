public class BicycleDemo {

    public static void main(String[] args) {

        Bicycle regularBike = new Bicycle();
        GearedBicycle gearedBike = new GearedBicycle();

        // Pedal both bikes 2 times
        regularBike.pedal();
        regularBike.pedal();

        gearedBike.pedal();
        gearedBike.pedal();

        System.out.println("Before braking:");
        System.out.println("Regular Bike Speed: " + regularBike.getSpeed());
        System.out.println("Geared Bike Speed: " + gearedBike.getSpeed());

        // Apply brakes
        regularBike.brake();
        gearedBike.brake();

        System.out.println("\nAfter braking:");
        System.out.println("Regular Bike Speed: " + regularBike.getSpeed());
        System.out.println("Geared Bike Speed: " + gearedBike.getSpeed());
    }
}