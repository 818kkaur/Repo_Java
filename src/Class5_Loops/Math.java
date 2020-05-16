package Class5_Loops;

import java.util.Arrays;

public class Math
{
    public static void main(String[] args) {
        for (int i = 0; i > -5; i -= 2) {
            System.out.println("Hello and i value" + i);
        }
        //print from 1 to 10 in reverse order
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // print even numbers between 1 to 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        // Between 1 to 10, print if the number is even or odd
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even #");
            } else
                System.out.println(i + " is an odd #");
        }
        int[] arrayNum = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arrayNum));

        int[] Array1 = new int[5];
        Array1[2] = 12;
        Array1[3] = 15;
        Array1[4] = 1573;
        Array1[1] = 12;
        Array1[0] = 23455;
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);
        }

        /**
         * Verify between 1 to 30
         * if number is divisible by 3, print "divisible by 3"
         * if number is divisible by 5, print "divisible by 5"
         * if number is divisible by 3 and 5, print "divisible by both"
         * if not divisible by 3 or 5, print the number
         *
         */
        // Use for loop or while loop

        for (int n = 1; n <= 30; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " is divisible by both");
            } else if (n % 5 == 0) {
                System.out.println(n + " is divisible by 5");
            } else if (n % 3 == 0) {
                System.out.println(n + " is divisible by 3");
            } else {
                System.out.println(n);
            }
            // Difference b/n while and do-while loop
            int g = 10;
            System.out.println("while loop starts");
            while (g > 100) {
                System.out.println("g=" + g);
                g++;
            }
            System.out.println("while loop ends");


            System.out.println("do-while loop starts");
            int g1 = 10;
            do {
                System.out.println("g1=" + g1);
                g1++;
            } while (g1 > 100);
            System.out.println("do-while loop ends");
        }
        // Enhanced for loop

        String[] names = {"happy", "love", "peace", "laugh"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //OR

        for (String name : names) {
            System.out.println(name);
        }
        /**
         * int[] numbers = {87, 90, 95, 120, 543};
         * Write code to calculate the sum of array numbers (87+90+95+120+543)
         *
         */
        int[] numbers = {87, 90, 95, 120, 543};
        int sum = 0;

        for (int total : numbers) {
            sum = sum + total; // or total+=value
        }
        System.out.println("Total" + sum);
    /* String[] students = {"happy", "philip", "peacephlo", "king Pharr"};
     String keyword = "ph";
  //print all names which contains the keyword (ignoring cases)*/

        String[] students = {"happy", "philip", "peacephlo", "king Pharr"};
        String keyword = "ph";
        for (String student : students) {
            if (student.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(student);
            }
        }

        //OR
        System.out.println(" Using simple for loop");
        for (int i = 0; i < students.length; i++) {
            if (students[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(students[i]);
            }
        }
        /* find the index of "philip" in students array
         */
        String[] students1 = {"happy", "philip", "peacephlo", "king Pharr"};
        String studentName = "philip";
        for (int i = 0; i < students1.length; i++) {
            boolean containsph = students[i].equalsIgnoreCase(studentName);
            if (containsph == true) {
                System.out.println("Index = " + i);
                break;
            }
        }

    }
}
