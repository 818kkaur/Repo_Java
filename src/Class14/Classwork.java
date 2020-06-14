

// No new topic discussed.....Just went over previous material
package Class14;

import java.util.*;

public class Classwork {
    public static void main(String[] args) {
       // Set and Map don't store value based on index
        //sort this array in ascending order
        int[] ar = {44, 65, 99, 23, 39, 12, 234, 76, 88};


        for (int i = 0; i < ar.length - 1; i++)
        {
            for(int j = i+1; j < ar.length; j++)
            {
                if(ar[i]> ar[j])
                {
                    int temp= ar[i];
                    ar[i]= ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    //------------------------------------------------------------------------------------------------------------------3
        System.out.println("*******************************************");
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> userPairs = new HashMap<>();
        System.out.print("How many Key/Value would you like to input?");
        int pairs = scanner.nextInt();

        for (int i = 0; i < pairs ; i++) {
            try {
                System.out.print("Enter a Integer for key:");
                int k = scanner.nextInt();
                System.out.print("Enter a String for key:");
                String v = scanner.next();
                userPairs.put(k,v);
            } catch (InputMismatchException e) {
                System.out.println("Must enter correct datatype");
                //e.printStackTrace();
            }
        }
        keyWithSameVal(userPairs);

    }
    public static void keyWithSameVal (Map<Integer,String> keyValPairs) {

        Set<Integer> duplicates = new HashSet<>();

        for (Integer key1 : keyValPairs.keySet()) {
            for (Integer key2 : keyValPairs.keySet()) {
                String val1 = keyValPairs.get(key1);
                String val2 = keyValPairs.get(key2);
                if (val1.equalsIgnoreCase(val2)) {
                    duplicates.add(key2);
                } else {
                    break;
                }
            }
        }
        if (duplicates.size() >= 1) {
            System.out.println("Keys with duplicate values:\n");
            duplicates.forEach(System.out::println);
        } else {
            System.out.println("No duplicate values found.");
        }
    }
    }






