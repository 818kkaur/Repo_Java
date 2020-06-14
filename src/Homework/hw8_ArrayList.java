package Homework;
import java.util.*;

public class hw8_ArrayList {
    public static void main(String[] args) {
        System.out.println("********Question 1****************");
        String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
        List<String> names = Arrays.asList(words);
       System.out.println(duplicateElement(names));

        System.out.println("\n");
        System.out.println("\n");

        System.out.println("********Question 2****************");
        int[] array1 = {11, 32, 43, 54, 65};
        int[] array2 = {76, 11, 89, 43, 87, 23, 32};
       // findCommonElement(array1, array2);
        List<Integer> demo =findCommonElement(array1,array2);
        System.out.println("Result --> " +demo);
        /**
         * Create a method, that will return all duplicates values in the given String array.
         * String[] words = {"happy", "peace", "joy", "grow", "laugh", "happy", "laugh", "joy"};
         * Result -> ["happy", "joy", "laugh"]
         */
    }

    public static List<String> duplicateElement(List<String> Ar1) {
        List<String> Ar2 = new ArrayList<>();
        for (int i = 0; i < Ar1.size(); i++) {
            if (Ar1.lastIndexOf(Ar1.get(i)) != i) {
                Ar2.add(Ar1.get(i));
            }
        }
        return Ar2;
    }



    /*
     * Create a method, that will return the common elements/value in two given int-array
     * int[] arr1 = {11, 32, 43, 54, 65}
     * int[] arr2 = {76, 11, 89, 43, 87, 23, 32}
     * Result -> [11, 32, 43]
     */
    public static List<Integer> findCommonElement(int[] a, int[] b) {

        List<Integer> commonElements = new ArrayList<Integer>();

        for(int i = 0; i < a.length ;i++) {
            for(int j = 0; j< b.length ; j++) {
                if(a[i] == b[j]) {
                    //Check if the list already contains the common element
                    if(!commonElements.contains(a[i])) {
                        //add the common element into the list
                        commonElements.add(a[i]);
                    }
                }
            }
        }
        return commonElements;
    }

    }




