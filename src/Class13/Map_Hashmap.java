package Class13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Hashmap {

        public static void main(String[] args) {

            Map<Integer, String> ssnData = new HashMap<>();
            System.out.println("Length of ssnData HashMap: " + ssnData.size());


            // add values in map
           // Put method can be  used if you want to replace any value in the key that is already being used.
            ssnData.put(101, "Happy");
            ssnData.put(102, "Peace");
            ssnData.put(103, "joy");
            ssnData.put(104, "grow");
            ssnData.put(105, "learn");
            ssnData.put(106, "live");

            System.out.println("SSN Data HashMap -> " + ssnData);

            //If we provide a different value to a key that has already been used then the 2nd value will replace the 1st value present at that key.
            ssnData.put(101,"green");
            System.out.println("SSN Data HashMap after key is used again-> " + ssnData);

            // to find the length of map (in other words, how many key-value pairs in map)
            System.out.println("Length of ssnData HashMap: " + ssnData.size());


            // remove values from map.....If key is not present, it will return null
            // if key present, remove the the pair and returns corresponding value which is also being removed.
            System.out.println("Value after removing key-102: " + ssnData.remove(102));
            // if the key-value pair found, removes the pair and returns 'true'. It will be also false if you entered wrong key or value by mistake.
            System.out.println("Result after removing '103,joy': " + ssnData.remove(103, "joy"));

            System.out.println("Value after removing key-1021: " + ssnData.remove(1021)); // returns null if key doesn't present
            System.out.println("Result after removing '103,grow': " + ssnData.remove(103, "grow")); // returns 'false' if doesn't find the key-value pair.


            System.out.println("\nSSN Data HashMap -> " + ssnData);
            System.out.println("Length of ssnData HashMap: " + ssnData.size());

            // get value associated with key
            System.out.println("Value associated with key-101: " + ssnData.get(101)); // if key found, returns corresponding else returns null

            // find if map contains a particular key
            System.out.println("does map contain key-101? : " + ssnData.containsKey(101));
            // if key present returns 'true' else 'false'

            // find if map contains a particular value
            System.out.println("does map contain value-grow? : " + ssnData.containsValue("grow")); // if value present returns 'true' else 'false'


            //keySet method used to print keys only and return type of this method is Set<> because it is clear that Map has unique keys but still Set makes sure no duplicate key will be return by any chance
            System.out.println("All keys in ssnData map -> " + ssnData.keySet());

            /** To retrieve key value pair in each line
             * 101=Happy
             * 102=Peace
             * 103=joy
             * 104=grow
             * 105=learn
             */

            Set<Integer> myKeys = ssnData.keySet();
            for(Integer mainKey: myKeys)
            {
                System.out.println(mainKey + "=" + ssnData.get(mainKey));
            }

            Collection<String> allValues = ssnData.values();
            System.out.println("All values in ssnData map -> " + allValues);

            System.out.println("Printing all values directly -> " + ssnData.values());

            System.out.println("is ssnData map empty? : " + ssnData.isEmpty());

            ssnData.clear(); // to empty the hashMap.....ssnData variable will still exist but it will mot have any content

            System.out.println("is ssnData map empty? : " + ssnData.isEmpty());


        }
    }

