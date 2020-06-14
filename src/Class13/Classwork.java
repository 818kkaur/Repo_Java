package Class13;

import java.util.*;

public class Classwork {
    public static void main(String[] args) {

        int[] deals = numbers();
        System.out.println(Arrays.toString(deals));
        for (int de : deals) {
            System.out.println(de);
        }
        /**
         * Create a hashMap with 5 pairs by taking key-value pairs from the user
//         * Key should be String
//         * Value should be Integer
//         */
//        int num = 10;
//
//        System.out.println("num = " + num);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter an int value");
//        int num2 = input.nextInt();
//        System.out.println("num2 = " + num2);
//        for (int i = 0; i < 5; i++) {
//            System.out.println("\nPlease enter name:");
//            String name = input.next();
//            System.out.println("Hello " + name);
//        }
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
         *
         * 4. find key(Student Name) corresponding to max-value (max-score)
         *
         */

        Map<String, Integer> scoresheet = new HashMap<>();
        scoresheet.put("student1" , 55);
        scoresheet.put("student2" , 265);
        scoresheet.put("student3" , 175);
        scoresheet.put("student4" , 85);

        Collection<Integer> scores = scoresheet.values();

        Object[] arr = scores.toArray();
        System.out.println(Arrays.toString(arr));

        Integer maxScore = Collections.max(scores); // Since this is collection, we can use Collections with s to get more methods
        // storing or using Collection<> somename.

        String topper = "";
        for (String name : scoresheet.keySet()) {
            if (scoresheet.get(name) == maxScore) {
                topper = name;
                break;
            }
        }
        System.out.println(topper + " scored max (" + maxScore + ") in the class");
    }

    public static int[] numbers() {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        return num;
    }

    public static void returnArray(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}
