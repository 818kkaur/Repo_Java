package Homework;

import java.util.*;

public class Homework9 {

    public static void main(String[] args)
    {
        System.out.println("************Question 2******************");
        Scanner s1 = new Scanner(System.in);
        HashMap<Integer,String> dupValues = new HashMap<>();
        System.out.println("Enter  name and score:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter a key (Integer) :");
            Integer key = s1.nextInt();
            System.out.println("Please enter value (String) to store with '" + key + "' key:");
            String value = s1.next();
            dupValues.put(key,value);
            setDuplicate(dupValues);
            System.out.println("\n");
            System.out.println("\n");
        }
        /**
         * Question 1:
         * Create a method, that will return all duplicates values with count from the given String List
         * List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
         * Output:
         *      happy - 2
         *      joy - 3
         *      laugh - 2
         **/
        System.out.println("************Question 1******************");
        List<String> Ar2 = new ArrayList<>(Arrays.asList("happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"));
        Map<String, Integer> dupCount = new HashMap<>();
        for(int i = 0 ; i<Ar2.size()-1; i++) {
            int count = 1;
            if (!dupCount.containsKey(Ar2.get(i))) {
                for (int j = i + 1; j < Ar2.size(); j++) {
                    if (Ar2.get(i).equalsIgnoreCase(Ar2.get(j))) {
                        count++;
                    }
                }
                if (count > 1) {
                    dupCount.put(Ar2.get(i), count);
                }
            }
        }
        System.out.println("Duplicate count " + dupCount);
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("************Question 3******************");
        Scanner S2 = new Scanner(System.in);
        Map<String, Integer> grades = new HashMap<>();
        System.out.println("Enter Student name and score:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter a key (String) :");
            String key = S2.next();
            System.out.println("Please enter value (Integer) to store with '" + key + "' key:");
            Integer value = S2.nextInt();
            grades.put(key, value);
        }
        maxScore(grades);


    }
       /* * Question:2
         * Create a hashMap with any numbers of key-value pairs from the user
         * Key should be Integer
         * Value should be String
         * if there are keys with same value, print the keys otherwise, create method that will "All keys have different values"
          eg- 101=happy, 102 = joy, 103= happy
         **/
        public static void setDuplicate(HashMap<Integer, String> dataMap)
        {
            Set<Integer> allKeys = dataMap.keySet();
            Set<Integer> keyWithoutDuplicate =  new HashSet<>();

            for(Integer key : allKeys)
            {
                String keyValue = dataMap.get(key);
                for(Integer anotherKey:allKeys)
                {
                    if(anotherKey!=key)
                    {
                        if(dataMap.get(anotherKey).equalsIgnoreCase(keyValue))
                        {
                            keyWithoutDuplicate.add(key);
                            keyWithoutDuplicate.add(anotherKey);
                        }
                    }
                }
            }
            System.out.println(keyWithoutDuplicate);
       }



//        Get all Keys from hashMap <-- for loop
//        pick key (let's say, key1) from keySet
//        store value(value1) related to above key in a variable
//        pick a key(key2) from KeySet <-- for loop
//        if it is NOT same as above key
//        if value of key2 is same as value1
//        store key1 and key2 in hashSet



        public static String maxScore(Map<String, Integer>scoresheet)
        {

            Collection<Integer> scores = scoresheet.values();

            Object[] arr = scores.toArray();
            System.out.println(Arrays.toString(arr));

            Integer highScore = Collections.max(scores);

            String topper = "";
            for (String name : scoresheet.keySet()) {
                if (scoresheet.get(name) == highScore) {
                    topper = name;
                    break;
                }
            }
            System.out.println(topper + " scored max (" + highScore + ") in the class");

            return topper;
        }
}






