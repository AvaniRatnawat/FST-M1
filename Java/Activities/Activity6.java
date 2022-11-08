package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {

        Plane plane = new Plane(10);
        plane.onboard("Peter");
        plane.onboard("Sherlock");
        plane.onboard("Anna");
        plane.onboard("Riya");

        //Print takeoff time
        System.out.println("Plane take off time : "+plane.takeOff() );

        //Print the list of passengers
        System.out.println("List of passengers : "+plane.getPassesngers());

        //Plane in flight
        Thread.sleep(5000);

        //Plane landed
        plane.land();
        System.out.println("Plane landed at : "+plane.getLastTimeLanded());
    }
}
