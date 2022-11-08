package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Sana");
        myList.add("Peter");
        myList.add("Sherlock");
        myList.add("Anna");
        myList.add("Donna");

        System.out.println("Names are as follows: \n");
        for(String n: myList){
            System.out.println(n);
        }

        System.out.println("Third name in the list: "+myList.get(2));
        System.out.println("Is Sarah in the list: "+myList.contains("Sarah"));
        System.out.println("Is Sana in the list: "+myList.contains("Sana"));
        System.out.println("Size of the list : "+myList.size());

        myList.remove("Anna");

        System.out.println("Size of the list after removing a name: "+myList.size());
    }
}
