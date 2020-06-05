package class10;

public class ExceptionNested {

 //   We can have nested try catch blocks. We can have try block inside the catch block.



    public static void main(String[] args) {

        System.out.println("Hello");

        int[] numbers = {11, 22};    // 0, 1

        System.out.println(numbers[0]);

        try {
            System.out.println(numbers[1]);
            System.out.println("Line 13");
            System.out.println(1 / 0);
            System.out.println(numbers[1]);

         } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Invalid index");
        } catch (ArithmeticException e2) {
            System.out.println("No divide by zero");
            try {
                System.out.println(2 / 0);
                System.out.println(numbers[22]);
                System.out.println("I am in line Arithmetic Exception block");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("New array out of bound exception");
            }
        } catch (Exception e3) {
            System.out.println("Generic exception occured");
            e3.printStackTrace();
        }

        System.out.println("After try-catch block");

    }
}
