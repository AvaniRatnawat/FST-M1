package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {

        Map<Integer, String> colours = new HashMap<>();
        colours.put(0,"Yellow");
        colours.put(1,"Green");
        colours.put(2,"Blue");
        colours.put(3,"Red");
        colours.put(4,"Purple");

        System.out.println("Colours in the map"+colours);
        System.out.println("Removing Blue from the map: "+colours.remove(2));
        if(colours.containsValue("Green"))
            System.out.println("Green is present in the map");
        else
            System.out.println("Green is not present in the map");

        System.out.println("Size of the map: "+colours.size());

    }
}
