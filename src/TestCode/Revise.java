package TestCode;

import java.util.Arrays;

public class Revise {
    public static void main(String[] args) {


        // Calculate(73);
        System.out.println("Question 2");
        int[] values = {0,1,3,4,5,6};
        solution(values);
        //System.out.println("Method should return: " + res1);


        /*Question 3:
         * Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points charged against the license for over speeding.
         *    1. Speed Limit = 70
         *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user gets 12 points for a speed then license is suspended
         *
         *  Example:
         *      user speed = 78 ; 1 points
         *      user speed = 88 ; 3 points
         *      user speed = 178 ; 21 points (License suspended).
         *      user speed = 70 ; Thank you for driving within the speed limit.
         *
         *      88 -> 3
         *      70
         *      70-75 : 1
         *      75-80 : 1 */
    }
        public static void Calculate(int userSpeed)
        {
            int speedLimit = 70;
            int points = (userSpeed - speedLimit) / 5;
           // System.out.println(points);

            if(userSpeed==70 && points==0)
            {
                System.out.println("Thank you for driving within the speed limit.");
            }
            else if(userSpeed>70 && userSpeed<=74 && points==0)
            {
                System.out.println("Your speed is: " + userSpeed+ ".You have "+ points+" points against your license.");
            }
            else if(points>0 && points<=11)
            {
                System.out.println("Your speed is: " + userSpeed+ ".You have "+ points+" points against your license.");
            }
            else if(points>=12)
            {
                System.out.println("You have "+ points+" against your license......Your license is suspended");
            }
        }

/**
 //     * Question 2:
 //     * Create a method to return missing smallest positive integer (greater than 0) from given array.
 //     * Example:
 //     * For array : {1, 3, 5, 4, 2, 7}
 //     * Method should return : 6
 //     * <p>
 //     * For array : {-1, -3, 4, 2}
 //     * Method should return : 1
 //     * <p>
 //     * For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
 //     * Method should return : 4
        Solution
        find 1 in array
        if  not found
            break;
        store it in the missing element variable
        find 2 in array
        if not found
            break;
            store it in the missing element variable
        AND so on......until you find missing element

 //     */


    public static void solution(int[] arr) {
        int checkFor = 0;
        // int[] val = {0,1,2,3,5,6};
        while (true) {
            boolean found = false;
            checkFor++;
            for (int i = 0; i < arr.length; i++)
                {
                    if (arr[i] == checkFor) {
                        System.out.println(checkFor + " found");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    break;
                }
            }

                    System.out.println("Missing value: "+checkFor);
            }
        }


//
//       for (int i = 1; i < arr.length; i++) {
//missingValue++;
//            for(int num = values)
//            {
//                if(i != num)
//
//                {
//                    System.out.println("Hello");
//                }
//                else if( i==num)
//                {
//                    System.out.println(num);
//            }


