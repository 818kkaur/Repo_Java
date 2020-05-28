package Homework;

public class Demo {
   /* public static double Division(int a, int b) {
        double result = 0;
        if (b != 0) {
            double num = a;
            result = num / b;
        }
        return result;
    }*/

    /**
     * Create a method to reverse any string
     */
    public static String ReverseString(String value) {
       // String message = "happy new year"; //syadiloh yppah
        String reverseMessage = "";
        System.out.println("Message : " + value);

        for (int i = value.length() - 1; i >= 0; i--) {
            reverseMessage = reverseMessage + value.charAt(i);

        }
        return reverseMessage;
    }
    /**
     * Create a method to find if a string is in palindrome
     * Reverse the string and compare
     */
    public static boolean Demo2(String name) {

        String reversed = ReverseString(name);
        return reversed.equalsIgnoreCase(name);
    }


    /**
     * Create a method to calculate sum of values in a given int-array
     */
//    public static int ArrayTotal(int[] arrName) {
//        int total = 0;
//        for (int num : arrName) {
//            total = total += num;
//        }
//        return total;
//    }

    public static void main(String[] args) {
        /*int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(ArrayTotal(numbers));
        int a = 15;
        int b = 5;

        System.out.println(Division(a, b));
*/
        String msg = "hello World";
        String answer = ReverseString(msg);
        System.out.println("Message in reverse: " + answer);
        String checkForPalindrome = "madam";
        System.out.println(checkForPalindrome + " is a palindrome? " + Demo2(checkForPalindrome));

    }

    public static class Printer {

        /**
         * Create a printer
         * <p>
         * max toner level = 100
         * max pages in tray = 100
         * with 1 page printing, 1 toner is being used
         * <p>
         * 1. addToner
         * 2. addPages
         * 3. Print (single and double)
         * 4. PrinterSummary
         * Toner level:
         * Pages count in tray:
         * 5. checkToner
         * if toner is less than 10; it should warn to "Add toner"
         */
        static int tonerLevel=100;
        static int pagesInTray = 100;
        int pagesRequired;

        int tonerRequired;

        public void printPages(int pagesToPrint, boolean ecoFr) {
            if (ecoFr) {
                if (pagesToPrint % 2 == 0) {
                    pagesRequired = pagesToPrint / 2;
                    tonerRequired = pagesToPrint;

                    pagesInTray = pagesInTray - pagesRequired;
                    tonerLevel = tonerLevel-tonerRequired;
                } else {
                    pagesInTray = pagesToPrint / 2 + 1;
                    tonerLevel = pagesToPrint;

                    pagesInTray = pagesInTray - pagesRequired;
                    tonerLevel = tonerLevel-tonerRequired;
                }
                System.out.println("Pages printed: " + pagesRequired +",double sided");
                System.out.println("Toner left: "+ tonerLevel);
            } else {
                pagesRequired = pagesToPrint;
                tonerRequired = pagesToPrint;

                pagesInTray = pagesInTray - pagesRequired;
                tonerLevel = tonerLevel-tonerRequired;

                System.out.println("Pages printed: " + pagesToPrint+"-Single sided");
                System.out.println("Toner left: "+ tonerLevel);
            }

        }
        public void printSummary() {
            System.out.println("Current Toner Level: " + tonerLevel);
            System.out.println("Total pages in tray " + pagesInTray);
        }

        public void tonerCapacity() {
            if (tonerLevel > 10) {
                System.out.println("Toner needs to be added to the printer");
            }
        }

        public void printerCapacity() {
            if (pagesInTray > 10) {
                System.out.println("More paper needs to be added to the printer");
            }
        }

        public void addToner(int tonerCount) {
            if (tonerCount > 0 && tonerCount <= 100) {


                if ((tonerCount + tonerLevel) <= 100) {
                    tonerLevel += tonerCount;
                } else {
                    System.out.println("More toner added than printer capacity");
                }
            } else {
                System.out.println("Invalid toner amount to add");
            }
        }

        public void addPages(int pCount) {
            if (pCount > 0 && pCount <= 100) {
                if (pCount + pagesInTray <= 100) {
                    pagesInTray = pCount + pagesInTray;
                } else {
                    System.out.println("Pages added over printer capacity");
                }
            } else {
                System.out.println("Invalid pages to add");
            }

        }

    }
}
//        byte HrsInDay = 24;
//        System.out.println(HrsInDay);
//
//        int DaysInYear = 365;
//        System.out.println(DaysInYear);
//
//        int TotalEmployee = 700;
//        System.out.println(TotalEmployee);
//
//        int TotalPopulation = 23456677;
//        System.out.println(TotalPopulation);
//
//        float IntRate = 2.75F;
//        System.out.println(IntRate);
//
//        int Balance = 235677;
//        System.out.println(Balance);
//
//        boolean Answer = false;
//        System.out.println(Answer);
//
//         String Initial  = "KK";
//        System.out.println("My initial are " + Initial);
//
//        String Name = "ABC";
//        System.out.println("My name is " + Name);
//        // Implement code to convert temperature values using below formulae:
//
//
//        double cTemp = 10.0;
//        double fTemp = ((9/5.0)*cTemp) +32;
//        System.out.println("Temperature in Fahrenheit "+ fTemp);
//        double kTemp = cTemp+273.0;
//        System.out.println("Temperature in Kelvins "+ kTemp);
//        double cTemp1 = kTemp - 273.0;
//        System.out.println("Temperature in Celsius "+ cTemp1);
//
//        //°F = 9/5 (K - 273) + 32
//        double fTemp1 = ((9/5.0)*(kTemp - 273)) + 32;
//        System.out.println("Temperature in Fahrenheit from Kelvin "+ fTemp1);


//         double kTemp1 = ((5/9.0)* (fTemp - 32)) + 273;
//        System.out.println("Temperature in Kelvin from Fahrenheit "+ kTemp1);





