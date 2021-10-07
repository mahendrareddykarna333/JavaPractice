package uk.access.modifiers;

public class Boeing787AeroPlane {

    public static final int FUEL_CAPACITY = 1000000000; // in liters
    public static final int ECONOMY_SEATING = 220;
    public static final int PREMIUM_ECONOMY_SEATING_COUNT = 50;
    public static final int FIRST_CLASS = 50;
    public static final int CLUB_WORLD = 50;

    private static final int MAX_SPEED = 1200;
    private static final int MIN_SPEED = 400;

    private int altitude;
    private int speed;

    public int publicInt;
    protected int protectedInt;


    private static int instanceCount = 0;


    public Boeing787AeroPlane() {
        instanceCount++;
      System.out.println("Constructor");
    }

    public void takeOff() {
        System.out.println("Take-off");
    }

    public void land() {
        System.out.println("Landing...");
    }

    public void increaseSpeedUpTo(int speed) {
        if(isAllowedSpeed(speed)) {
            this.speed = speed;
        }
    }

    public void decreaseSpeed(int speed) {
        if(isAllowedMinimumSpeed(speed)) {
            this.speed = speed;
        }
    }


    private boolean isAllowedSpeed(int speed) {
        return speed < MAX_SPEED;
    }

    private boolean isAllowedMinimumSpeed(int speed) {
        return speed > MIN_SPEED;
    }

    public void autoPilotMode(int hours) {
        //Autopilot mode
    }


    protected void activateEmergencyExist() {
        System.out.println("Activate emergency exit");
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return "Boeing787AeroPlane{" +
                "altitude=" + altitude +
                ", speed=" + speed +
                '}';
    }
}
