package activities;

public class MountainBike extends Bicycle{

    public int seatHeight;
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int height) {
        seatHeight = height;
    }

    public String bicycleDesc() {
        return ("Seat Height = "+seatHeight);
    }
}
