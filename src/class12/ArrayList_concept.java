package class12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayList_concept {
    public static void main(String[] args) {
        int [] ar1 = {1,2,3,4,5};
        System.out.println(ar1.length);
        //Best way to create an object as it will give access to List Interface
        List<Integer> Ar2  = new ArrayList<>();
        List<String> names = new ArrayList<>();
       //Add method
        Ar2.add(12);
        Ar2.add(113);
        Ar2.add(121);
        Ar2.add(11323);
        names.add("happy");
        names.add("peace");
        names.add("joy");
        names.add("grow");
        names.add("peace");
        names.add("happy");

        //If you just want to print all the values of any given arraylist
        System.out.println(names);


        //Size method to find the length of array
        System.out.println(Ar2.size());
        System.out.println(names.size());
        //Remove method- removes based on index in integer........when printed, it will tell u wat value has been removed
        System.out.println(Ar2.remove(2));
        System.out.println("New size of my list after removal: "+Ar2.size());

        System.out.println(names.remove(2));
        //If multiple values to be removed then with this method, only the 1st value will be removed.
        //If we use remove method in string datatype then you have to give value instead of the index whereas if datatype is integer then it will take index value
        System.out.println(names.remove("happy"));
        System.out.println("New size of names after removal: "+names.size());
        System.out.println(names);

        // Set method- replaces a value at a particular index
        // will return a value that is being removed
       //If index is not present,indexoutofbound exception
        System.out.println(names.set(2, "Content"));
        System.out.println(names);
        System.out.println(Ar2);
        System.out.println(" ****************************************************");
       // Find the index of given value

        //Contain method-Will return a boolean value
        System.out.println("Does my List contains 113? " +Ar2.contains(113));
        System.out.println("Does my names contains happy? " +names.contains("happy"));
        System.out.println("does names contains 'Happy'?: " + names.contains("Happy".toLowerCase()));


        // IndexOf Method-Will tell u the specific  index of a particular value. If duplicate value, it will tell the first occurrence of that value
        // find index of first occurrence of given value.
        System.out.println("index of 11323 in Ar2: " + Ar2.indexOf(11323));

        //Last index of--useful when u have dupliCATE VALUES AND YOU WANT TO KNOW THE LAST OCCURRENCE(INDEX) OF THAT VALUE
        System.out.println(Ar2.lastIndexOf(11323));
        // if value found -> returns index-value
       // else returns -1
        System.out.println("index of 11 in Ar2: " + Ar2.lastIndexOf(11)); // -1

        // if value found -> returns index-value
        // else returns -1
System.out.println("index of 'happy' in names: " + names.indexOf("happy"));

   // find value at specific index

           // GET METHOD
        System.out.println("Value at index-2: " + Ar2.get(0));
        System.out.println("Value at index-2: " + names.get(0));
//        // return value if index is good.
//        // else exception
      //  System.out.println("Value at index-0: "+Ar2.get(5));...............................you will get an exception

        //Empty method......returns boolean
      // check if arraylist is empty
        System.out.println("does Ar2 empty?: " + Ar2.isEmpty());
        System.out.println("Length of my list: " +Ar2.size());

       // Clear method----empty your arrayList
       Ar2.clear();

        System.out.println("does Ar2 empty?: " + Ar2.isEmpty());
        System.out.println("Length of my list: " +Ar2.size());

    }


}
