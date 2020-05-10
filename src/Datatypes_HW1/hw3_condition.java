package Datatypes_HW1;

public class hw3_condition {
    public static void main(String[] args) {


        /**
         * Checking car mode (P, D, N, R)
         * if car mode is P and "you can park car"
         * if car mode is D drive car
         *      if drive type is Snow, display "You are on Snow mode"
         *      if drive type is Sport, display "You are on Sport mode"
         *      if drive type is Eco, display "You are on Eco mode"
         * if car mode is N you can "put car in car wash"
         * if car mode is R you can "revere the car"
         */
        String driveType = "Sport";

        char gear = 'D';
        switch (gear) {
            case 'P':
                System.out.println("you can park car");
                break;
            case 'D':
                if (driveType == "Snow")
                    System.out.println("You are on Snow mode");
                else if (driveType == "Sport")
                    System.out.println("You are on Sport mode");
                else if (driveType == "Eco")
                    System.out.println("You are on Eco mode");
                break;
            case 'N':
                System.out.println("put car in car wash");
                break;
            case 'R':
                System.out.println("revere the car");
                break;
            default:
                System.out.println("Invalid car mode");
        }
        /**
         * store value in an int variable
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */
        int n = 40;
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both");
        } else if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        } else if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3");
        } else {
            System.out.println(n);
        }
        /* Create variable to store student-score, and total-possible-score based on the percentage,
         * display grade to student
         * Grade A: 91-100
         * Grade B: 81-90
         * Grade C: 71-80
         * Grade D: 61-70
         * Grade E: 51-60
         * Grade F: less than or equal to 50
         */
        //calculate percentage
        //Your percentage: XX.yy and your grade is: A
        int studentScore = 40;
        int maxScore = 150;
        float value = (studentScore * 100) / maxScore;

        if (value > 90 && value < 100) {
            System.out.println("Your percentage is " + value + " and your grade is A");
        } else if (value > 81 && value <= 90) {
            System.out.println("Your percentage is  " + value + " and your grade is B");
        } else if (value > 71 && value <= 80) {
            System.out.println("Your percentage is  " + value + " and your grade is C");
        } else if (value > 61 && value <= 70) {
            System.out.println("Your percentage is  " + value + " and your grade is D");
        } else if (value > 51 && value <= 60) {
            System.out.println("Your percentage is  " + value + " and your grade is E");
        } else if (value <= 50) {
            System.out.println("Your percentage is  " + value + " and your grade is F");
        }
    }
}