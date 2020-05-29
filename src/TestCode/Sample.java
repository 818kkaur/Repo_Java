package TestCode;
import java.util.Arrays;

public class Sample {

    public static void main(String[] args) {
        System.out.println("Question 1");
        int[] num = {32, 14, 24, 98, 24, 56, 148};
       numRemove(num, 24);

        System.out.println("Question 2");
        int[] values = {1, 2, 3, 5, 6, 7};
        int res1 =solution(values);
        System.out.println("Method should return: "+ res1);

        System.out.println("Question 3");
        speedingTicket(179);
    }
    /**
     * Question 2:
     * Create a method to return missing smallest positive integer (greater than 0) from given array.
     * Example:
     * 	For array : {1, 3, 5, 4, 2, 7}
     * 	Method should return : 6
     *
     * 	For array : {-1, -3, 4, 2}
     * 	Method should return : 1
     *
     * 	For array : {0, 5, -1, 1, 2, 5, 3, 7, 1, 2}
     * 	Method should return : 4
     */
    public static int solution(int[] arr) {
        int smallestInt = 1;

        if(arr.length == 0) return smallestInt;

        Arrays.sort(arr);

        if(arr[0] > 1) return smallestInt;
        if(arr[ arr.length - 1] <= 0 ) return smallestInt;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == smallestInt){
                smallestInt++;}
        }

        return smallestInt;
    }
    /**
     * Question 1:
     * Create a method to return an array after remove a specific value from a given int array.
     * Original array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Remove: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     * <p>
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Remove: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */
    public static void numRemove(int[] numbers, int target) {
        //int count;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != target) {
                System.out.print(" " + numbers[i] + " ");
            }

        }
        System.out.print("\n");
    }


/*
 * Question 3:
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

    public static void speedingTicket(double userSpeed)
    {
        //int points = 0;

        if(userSpeed==70)
        {
            System.out.println("Thank you for driving within the speed limit.");
        }
        else if(userSpeed>70 && userSpeed<=75)
        {
            System.out.println("You have scored 1 point against your license");
        }
        else if(userSpeed>75 && userSpeed<=80) {
            System.out.println("You have scored 2 points against your license");
        }

        else if(userSpeed>80 && userSpeed<=85) {
            System.out.println("You have scored 3 points against your license");
        }
        else if(userSpeed>85 && userSpeed<=90) {
            System.out.println("You have scored 4 points against your license");
        }
        else if(userSpeed>90 && userSpeed<=95) {
            System.out.println("You have scored 5 points against your license");
        }
        else if(userSpeed>95 && userSpeed<=100) {
            System.out.println("You have scored 6 points against your license");
        }
        else if(userSpeed>100 && userSpeed<=105) {
            System.out.println("You have scored 7 points against your license");
        }
        else if(userSpeed>105 && userSpeed<=110) {
            System.out.println("You have scored 8 points against your license");
        }
        else if(userSpeed>110 && userSpeed<=115) {
            System.out.println("You have scored 9 points against your license");
        }
        else if(userSpeed>115 && userSpeed<=120) {
            System.out.println("You have scored 10 points against your license");
        }
        else if(userSpeed>120 && userSpeed<=125) {
            System.out.println("You have scored 11 points against your license");
        }
        else if(userSpeed>125 && userSpeed<=130) {
            System.out.println("You have scored 12 points against your license");
        }
        else if(userSpeed>135 && userSpeed<=140) {
            System.out.println("You have scored 13 points against your license");
        }
        else if(userSpeed>145 && userSpeed<=150) {
            System.out.println("You have scored 14 points against your license");
        }
        else if(userSpeed>150 && userSpeed<=155) {
            System.out.println("You have scored 15 points against your license");
        }
        else if(userSpeed>155 && userSpeed<=160) {
            System.out.println("You have scored 16 points against your license");
        }
        else if(userSpeed>160 && userSpeed<=165) {
            System.out.println("You have scored 17 points against your license");
        }
        else if(userSpeed>165 && userSpeed<=170) {
            System.out.println("You have scored 18 points against your license");
        }
        else if(userSpeed>170 && userSpeed<=175) {
            System.out.println("You have scored 19 points against your license");
        }
        else if(userSpeed>175 && userSpeed<=180)
        {
            System.out.println("You have scored 20 points against your license......Your license is suspended");
        }
    }

}