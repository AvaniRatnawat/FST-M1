package activities;

public class Activity1 {
    public static void main(String[] args) {

        Car Jaguar = new Car();

        // Intializing car objects
        Jaguar.transmission = "Manual";
        Jaguar.make = 2014;
        Jaguar.color = "Black";

        //Using Car methods
        Jaguar.displayCharacteristics();
        Jaguar.accelarate();
        Jaguar.brake();

    }
}
