package Datatypes_HW1;



public class Demo
{
    public static void main(String[] args)
    {
        byte HrsInDay = 24;
        System.out.println(HrsInDay);

        int DaysInYear = 365;
        System.out.println(DaysInYear);

        int TotalEmployee = 700;
        System.out.println(TotalEmployee);

        int TotalPopulation = 23456677;
        System.out.println(TotalPopulation);

        float IntRate = 2.75F;
        System.out.println(IntRate);

        int Balance = 235677;
        System.out.println(Balance);

        boolean Answer = false;
        System.out.println(Answer);

         String Initial  = "KK";
        System.out.println("My initial are " + Initial);

        String Name = "ABC";
        System.out.println("My name is " + Name);
        // Implement code to convert temperature values using below formulae:


        double cTemp = 10.0;
        double fTemp = ((9/5.0)*cTemp) +32;
        System.out.println("Temperature in Fahrenheit "+ fTemp);
        double kTemp = cTemp+273.0;
        System.out.println("Temperature in Kelvins "+ kTemp);
        double cTemp1 = kTemp - 273.0;
        System.out.println("Temperature in Celsius "+ cTemp1);

        //°F = 9/5 (K - 273) + 32
        double fTemp1 = ((9/5.0)*(kTemp - 273)) + 32;
        System.out.println("Temperature in Fahrenheit from Kelvin "+ fTemp1);



         double kTemp1 = ((5/9.0)* (fTemp - 32)) + 273;
        System.out.println("Temperature in Kelvin from Fahrenheit "+ kTemp1);

    }
}
