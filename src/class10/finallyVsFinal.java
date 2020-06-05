package class10;

public class finallyVsFinal {
    public static void main(String[] args) {

        /**
         * finally:
         *      is code block with try-catch.
         *      which always executes irrespective of exception occurs.
         *
         * final:
         *      is a keyword, which we use to make variable value constant.
         *      In other words, if a variable final, user cannot CHANGE it's value.
         */

        int num = 10;               // user assigning the initial value to num
        System.out.println(num);    // 10
        num = 20;                   // user is changing the value of num
        System.out.println(num);    // 20

        final int num1 = 100;       // user assigning the initial value to num1
        System.out.println(num1);   // 100
        // num1++;                  // user cannot CHANGE the value of final variable (num1 += 100)
        System.out.println(num1);   // 100

        final int num2;
        num2 = 100;                // user assigning the initial value to num2
    }
}
