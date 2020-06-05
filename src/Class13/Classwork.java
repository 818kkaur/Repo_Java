package Class13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Classwork {
    public static void main(String[] args) {
        /**
         * Create a hashMap with 5 pairs by taking key-value pairs from the user
         * Key should be String
         * Value should be Integer
         */
        int num = 10;

        System.out.println("num = " + num);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an int value");
        int num2 = input.nextInt();
        System.out.println("num2 = " + num2);
        for (int i=0 ; i < 5 ; i++) {
            System.out.println("\nPlease enter name:");
            String name = input.next();
            System.out.println("Hello " + name);
        }
        /**
         * School:
         * Student1 - 55
         * Student2 - 65
         * Student3 - 75
         * Student4 - 85
         * Student5 - 95
         *
         * Store the data in appropriate variable
         * and print the name of student who scored max marks.
         *
         * 1. Store data in scoreSheet map variable
         * 2. get allValues from scoreSheet (scores)
         * 3. find max value in score-Collection
         * 4. find key(Student Name) corresponding to max-value (max-score)
         *
         */

        Map<String, Integer> studentCard = new HashMap<>();
        studentCard.put("Student1", 55);
        studentCard.put("Student2", 65);
        studentCard.put("Student3", 75);
        studentCard.put("Student4", 85);
        studentCard.put("Student5", 95);

        Collection<Integer> scores = studentCard.values();

        }
    }

