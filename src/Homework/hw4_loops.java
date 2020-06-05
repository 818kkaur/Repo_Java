package Homework;

import java.util.Scanner;

public class hw4_loops {
    public static void main(String[] args) {


        /**
         * Write code to create abbreviation for any given string
         * Example: String msg = "Outfit of the day" //
         * Expected: OOTD //GM HAGDTY
         * String msg = "have a great day to you"
         *
         * //code
         *
         * sout("Abbreviation : " + abr);
         */
        String abr = "";
        String msg = "Outfit of the day";
        String[] arrName = msg.split(" ");
        for (String array1 : arrName) {
            abr = abr + array1.toUpperCase().charAt(0);
        }
        System.out.println("Abbreviation:  " + abr);

        /**
         //                 * Make 1st Char of each word Capital
         //                 */
                String line = "once upOn a tiMe in the UNIVERSE"; //Once Upon A Time In The Universe
                System.out.println("Line (Before modification): " + line);
                String[] lines = line.toLowerCase().split(" ");
                line = "";
                for (String value : lines) {
                line += value.toUpperCase().substring(0, 1) + value.substring(1) + " ";
                }
                System.out.println("Line (After modification):" + line.trim());

/**

 /*
 * reverse a string

 String message = "happy holidays"; //syadiloh yppah
 String reverseMessage = "";
 System.out.println("Message : " + message);
 // code
 System.out.println("Message in reverse: " + reverseMessage);*/

        String message = "happy new year"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + message);

        for (int i = message.length() - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + message.charAt(i);

        }
        System.out.println("Message in reverse: " + reverseMessage);

        /**
         // * Check if word is palindrome
         //                */
//        String word = "level";
//        boolean result=false;
//         //code
//        System.out.println("is " + word + " a palindrome: " + result);

        String original = "Madam";
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        boolean Case = false;
        if (original.equalsIgnoreCase(reverse)) {
            Case = true;
        }
        System.out.println("Is " + original + " a palindrome: " + Case);
    }
}



