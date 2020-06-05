package Homework;
import java.util.*;

public class hw8_ArrayList {
    public static void main(String[] args) {
        System.out.println("********Question 1****************");
        duplicateElement();

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("********Question 2****************");
        int[] array1 = {11, 32, 43, 54, 65};
        int[] array2 = {76, 11, 89, 43, 87, 23, 32};
        commonElement(array1, array2);

        /**
         * Create a method, that will return all duplicates values in the given String array.
         * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
         * Result -> ["happy", "joy", "laugh"]
         */
    }

    public static List<String> duplicateElement() {

        List<String> Ar1 = new ArrayList<>();
        Ar1.add("happy");
        Ar1.add("peace");
        Ar1.add("joy");
        Ar1.add("grow");
        Ar1.add("laugh");
        Ar1.add("happy");
        Ar1.add("laugh");
        Ar1.add("joy");
        for (int i = 0; i < Ar1.size(); i++) {
            if (Ar1.lastIndexOf(Ar1.get(i)) != i) {
                System.out.print(Ar1.get(i) + " ");
            }
        }
        return Ar1;

    }

    /*
     * Create a method, that will return the common elements/value in two given int-array
     * int[] arr1 = {11, 32, 43, 54, 65}
     * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     * Result -> [11, 32, 43]
     */
    public static void commonElement(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    System.out.print(arr1[i] + " ");

                }
            }
        }
    }

}
