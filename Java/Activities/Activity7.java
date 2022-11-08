package activities;

public class Activity7 {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(5, 220, 10);
        mb.setHeight(20);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(50);
        mb.applyBrake(20);
    }
}
