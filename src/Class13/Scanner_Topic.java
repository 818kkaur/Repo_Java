package Class13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Scanner_Topic {

    public static void main(String[] args) {

        int num = 10;
        System.out.println("num = " + num);

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter an int value");
        int num2 = input.nextInt(); //this line will let the user enter the value in console

        System.out.println("num2 = " + num2);
//          These methods have all the code needed to take the value from the console and assign them to variables
//            If you are taking multiple multiple input from the user, it is better to use .next instead of  .nextline especially when ou are using loop
        //USe a loop if you have to take multiple input from user
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPlease enter name:");
            String name = input.next();
            System.out.println("Hello " + name);
        }
        //input.next or input .nextline to enter string
        //input.nextInt to enter integer value
        //If the correct value for a particular data type is not added by user then it will throw exceptionx


        /**
         * Create a hashMap with 5 pairs by taking key-value pairs from the user
         * Key should be String
         * Value should be Integer
         */
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> schoolScores = new HashMap<>();
        System.out.println("Enter Student name and score:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a key (String) :");
            String key = scanner.next();
            System.out.println("Please enter value (Integer) to store with '" + key + "' key:");
            Integer value = scanner.nextInt();
            schoolScores.put(key, value);
        }
        System.out.println(schoolScores);

        // to close the link/connection between console and java-program
        input.close();


    }
}






