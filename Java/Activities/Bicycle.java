package activities;

public class Bicycle implements BicycleParts, BicycleOperations{

    public int gears;
    public int currentSpeed;

    //Initialize the values of gears & speed
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed  = currentSpeed;
    }

    //Implement applyBrake method
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current Speed after applying brakes is : "+currentSpeed);
    }

    //Implement speedUp method
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current Speed after speed up is : "+currentSpeed);
    }

    //Implement bicycleDesc method

    public String bicycleDesc() {
        return ("No. of Gears = "+gears+"\n Speed of the bicycle = "+currentSpeed);
    }
}
