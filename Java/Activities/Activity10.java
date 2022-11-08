package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet();
        hs.add("Arctic");
        hs.add("Antarctica");
        hs.add("Asia");
        hs.add("America");
        hs.add("Africa");
        hs.add("Japan");

        System.out.println("Size of Hashset: "+hs.size());

        System.out.println("Removing Japan from hashset:"+hs.remove("Japan"));
        if(hs.remove("Korea")){
            System.out.println("Removed Korea from hashset");
        }else {
            System.out.println("Korea is not present in hashset");
        }
        System.out.println("Is Norway present in hashset: "+hs.contains("Norway"));
        System.out.println("Updated hashset: ");
        for(String x:hs){
            System.out.println(x);
        }
    }
}
