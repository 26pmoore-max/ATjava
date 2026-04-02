public class GearedBicycle extends Bicycle {

    private int gear;

    public GearedBicycle() {
        gear = 1;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void brake() {
        speed -= 2; // directly access inherited field
        if (speed < 0) {
            speed = 0;
        }
    }
}
