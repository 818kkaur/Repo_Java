package class10;

public class ExceptionsFinally {
   // import com.sun.media.sound.AiffFileReader;
   //Finally block is optional. WE can throw exception inside finally block and use try-catch block to handle it. One try block can have one finally bloc



        public static void main(String[] args) {

            System.out.println("Hello");
            int[] numbers = {11,22};    // 0, 1
            System.out.println(numbers[0]);

            try {
                System.out.println(numbers[1]);
                System.out.println("Line 13");
                System.out.println(40/0);
                System.out.println(numbers[1]);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("Invalid index");
            } catch (ArithmeticException e2) {
                System.out.println("No divide by zero");
            } finally {
                /**
                 * code inside this section will execute code-inside try block whether exception occurs or not
                 */
                try {
                    System.out.println("Inside the finally block");
                    System.out.println(2/2);
                    System.out.println("Last line in finally section");
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception in finally block");
                } finally {
                    System.out.println("Inside the nested finally block");
                }

            }

            System.out.println("After try-catch-finally block");




        }
    }

