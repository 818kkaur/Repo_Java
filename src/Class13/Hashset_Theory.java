package Class13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset_Theory {
    public static void main(String[] args) {
        Set<Double> mileages = new HashSet<>();
        mileages.add(2.2);
        mileages.add((double) 2); // 2.0
        mileages.add(3.14);
        mileages.add(2.2);
        mileages.add(9.8);

        System.out.println("Total mileage values: " + mileages.size());
        System.out.println("Mileages -> " + mileages);

       // THe length is 4 because 2.2 is  repeated twice so the second value of 2.2 will be ignored.
        //
        //Set never store the sequence of insertion…….It will just print out the data in any order.
        // Set will never store the values based on indexes so no sequencing
        /**
         * Create List using Set
         */
        List<Double> listUsingSet = new ArrayList<>(mileages);
        System.out.println("List using Set -> " + listUsingSet);

        List<Integer> Ar2 = new ArrayList<>();

        Ar2.add(12);
        Ar2.add(113);
        Ar2.add(121);
        Ar2.add(11323);
        Set<Integer> numbers = new HashSet<>(Ar2);
        if (Ar2.size() == numbers.size()) {
            System.out.println("No duplicate values");
        } else {
            System.out.println("Some duplicate values present");
        }

    }
}
