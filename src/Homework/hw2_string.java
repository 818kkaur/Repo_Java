package Homework;

public class hw2_string {
    public static void main(String[] args) {
        /*
         *
         * Store your first name in a variable, and display the following:
         *     1. Display length of the first name.
         *     2. Does your name starts with "K" (Considering cases)
         *     3. First alphabet of your name
         *     4. Does your name ends with "M" (Ignoring cases)
         */
        String FirstName = "Anabella";
        System.out.println("The length of " + FirstName + " is " + FirstName.length());
        System.out.println("Does your name starts with K? " + FirstName.startsWith("K"));
        System.out.println("First alphabet of " + FirstName + " is " + FirstName.charAt(0));
        System.out.println("Does your name ends with M? " + FirstName.toUpperCase().endsWith("M"));

        /* String myStatement = "I am a good programmer";
         * Use string methods to do following tasks:
         * 	1. Fetch the last word of the sentence
         * 	2. Display the total number of words in the myStatement.
         * 	3. replace all the 'r' characters with 'f' characters.

         */
        String myStatement = "I am a good programmer";
        String[] Array1 = myStatement.split(" ");
        int Index = Array1.length - 1;
        System.out.println("The last word in the sentence is " + Array1[Index]);

        String[] words = myStatement.trim().split("\\s+");

        System.out.println("Total number of words = " + (words.length));

        System.out.println("New statement after replacement: " + myStatement.replace('r', 'f'));

        /* Store your first name in a string variable.
         Calculate the length of your name, without using length() method of String class.
         */
        String FName = "Mary";
        String[] FNameLetters = FName.split("");
        System.out.println("Length of Name: " + FNameLetters.length);

    }




}
