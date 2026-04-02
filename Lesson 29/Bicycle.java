public class Bicycle {
    protected int speed; // changed from private to protected
    private final int MAX_SPEED = 30;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void pedal() {
        speed = speed + 1;
        if (speed > MAX_SPEED) {
            speed = MAX_SPEED;
        }
    }

    public void brake() {
        speed = speed - 1;
        if (speed < 0) {
            speed = 0;
        }
    }
}
