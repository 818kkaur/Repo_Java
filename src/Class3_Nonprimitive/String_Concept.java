package Class3_Nonprimitive;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class String_Concept {
    public static void main(String[] args) {
//  String cityName = "New York City";
//  int result = cityName.length();
//  System.out.println("The length of '" + cityName + "' is " + result);
//
//  String lowercaseCityName = cityName.toLowerCase();
//  System.out.println("The lower case shows like " + lowercaseCityName);
//
//  // System.out.println("The lower case shows like "+ cityName.toLowerCase());
//  String uppercaseCityName = cityName.toUpperCase();
//  System.out.println("The upper case shows like " + uppercaseCityName);
//
//  Boolean isEqual = lowercaseCityName.equals(uppercaseCityName);
//  System.out.println("The result of Equal method is " + isEqual);
//
//  Boolean isEqualIgnoreCase = lowercaseCityName.equalsIgnoreCase(uppercaseCityName);
//  System.out.println("The result of Equal method is " + isEqualIgnoreCase);
//
//  String isCity = "Hello world....how are you?";
//  boolean Result = isCity.contains("hello");
//  System.out.println("Does the sentence contain Hello word?" + Result);
//  // Find the word how and ignore the cases
//  String Ans = isCity.toLowerCase();
//  boolean Demo = Ans.contains("how");
//  System.out.println("Does your sentence contain how word?" + Demo);
//  // OR
//  boolean Answer = isCity.toLowerCase().contains("how");
//  System.out.println("Does your sentence contain how word?" + Answer);
//  String NewCity = "New York City";
//  //replace method
//  //Do some replace function without creating new variable
//
//  String AfterReplace = NewCity.replace('C', 'c');
//  System.out.println(AfterReplace);
//  NewCity = NewCity.replace("York", "Lake");
//  System.out.println(NewCity);
//
//  //CharAt - used to find which alphabet/character is on which index
//  // we give index value
//  String Display = "Hello World";
//  char Show = Display.charAt(2);
//  System.out.println(Show);
//
//  //string var = "This is Hello World";.......We can have anything in this string
//  // Print the last index value
//  String var = "This is Hello World";
//  int Share = var.length();
//  char Hold = var.charAt(Share - 1);
//  System.out.println("Value of last index is " + Hold);
//  // OR
//  char Hold1 = var.charAt(var.length() - 1);
//  System.out.println("Value of last index is " + Hold1);
//  // OR
//  System.out.println("Value of last index is " + var.charAt(var.length() - 1));
//
//  // Index of
//  String Msg = "Hello! How are you doing?";
//  int hello1 = Msg.indexOf('d');
//  System.out.println(hello1);
//  int hello2 = Msg.indexOf("are you");
//  System.out.println(hello2);
//  int hello3 = Msg.indexOf("Are you");
//  System.out.println(hello3);
//  int indexOfO = Msg.indexOf('o');
//  System.out.println(indexOfO);
//
//  //Last index
//  int lastIndexOfo = Msg.lastIndexOf('o');
//  System.out.println(lastIndexOfo);
//
//  //starts with
//  boolean hello4 = Msg.startsWith("Hello");
//  System.out.println(hello4);
//
//  //Ends with
//  boolean hello5 = Msg.endsWith("doing?");
//  System.out.println(hello5);
//
//  //trim
//  String word = "   How are   you?   ";
//  System.out.println(word.trim());
//
//  //substring
//  String word1 = "How are you?";
//  String extract = word1.substring(3, 10);
//  System.out.println(extract);
//  String extract1 = word1.substring(3);
//  System.out.println(extract1);
//
//  //split
//  String gold = "Hello how are you? I am parallel";
//  String[] arrName = gold.split("l");
//  System.out.println(Arrays.toString(arrName));
//  String[] arrName1 = gold.split("ll");
//  System.out.println(Arrays.toString(arrName1));
//  String[] arrName2 = gold.split("");
//  System.out.println(Arrays.toString(arrName2));
//  String[] arrName3 = gold.split(" ");
//  System.out.println(Arrays.toString(arrName3));


//     String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};
////take each name from above array, and print like:
//// Name: happy
//// Name: peace
    /*    String[] names = {"happy", "peace", "laugh", "love", "grow", "learn", "great", "nice"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        //String[] names = {"happy", "peace", "laugh", "love", "grow", "learn"};
         //take values from names-array, print the name if name-length is 5 or more,
        // and print like: Happy (first-letter in uppercase and rest in lowercase
        for (String name : names) {
            if (name.length() >= 5) {
                System.out.println(name.substring(0, 1).toUpperCase()+ name.substring(1));
            }
        }
        //take values from names-array, print only odd index values
        for(int i=1; i < names.length; i+=2)
        {
            System.out.println(names[i]);
        }
        //print names-array backwards*/
      /* String[] names1 = {"happy", "peace", "laugh", "love", "grow", "learn"};
        for(int i=names1.length-1; i>=0; i--)
        {
            System.out.println(names[i]);
        }*/
        // print the values from names-array if,
        // 1. name-length is greater than ir equal to 5
        // And, 2. name-value contains 'p' (DO NOT consider cases)
        String[] names1 = {"happy", "peace", "laugh", "love", "grow", "learn"};
        for (String name : names1) {
            if (name.length() >= 5 && name.contains("e"))
            {
                System.out.println(name);
            }
        }

        String[] months = {"January", "February", "March", "April" , "May", "June", "July", "August", "September", "October", "November", "December"};
        /**
         * Use below data
         * Dec, Jan, Feb: Winter
         * Mar, Apr, May: Spring
         * Jun, Jul, Aug: Summer
         * Sep, Oct, Nov: Fall
         *
         * print like,
         * Month: January -> Season: Winter
         * Month: February -> Season: Winter
         */
        int[] numberString = {1, 2, 3, 4};
        String[] textString = {"How", "are", "you","?"};
        System.out.println("This is String array: " + Arrays.toString(textString));
        System.out.println("This is int array: " + Arrays.toString(numberString));

        int [] numbers = {1,3,5};

        for(int i=0; i<= numbers.length-2 ;i++)
        {
            System.out.println(numbers[i]);
        }




    }
}