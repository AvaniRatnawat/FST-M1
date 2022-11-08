package activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {

        int[] input = {9,12,4,4,3,1,10};
        sort(input);
        System.out.println("Sorted Array : "+ Arrays.toString(input));
    }

    public static void sort(int inputArr[]) {

     for(int i=1; i<inputArr.length;i++) {
         int x = inputArr[i];
         int j = i;
         while(j>0 && x < inputArr[j-1]){
             inputArr[j] = inputArr[j-1];
             j--;
         }
            inputArr[j] = x;

        }

    }
}
