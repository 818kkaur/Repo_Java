package Homework;

public class HW5_Methods {
    public static void main(String[] args) {
      int[] num = {70, -55, 85, 90, 100};
        float total = average(num);
        System.out.println("The average of given numbers is: " + total);

        String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"};
        String nameToSearch = "philip";

        System.out.println(position(names, nameToSearch));

        int[] num1 = {70,32,500,55, 85, 90, 100};

        int result = getMaxNumber(num1);
        System.out.println("Maximum value in the given array is " +result);

        int[] scores = {90, 89, 191, 100, 681};
      String[] name1 = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};

        System.out.println(findTopper(scores, name1));

        }
    /**
     * Create a method to find average of an int-array
     * Average of the given array: 123
     */
    public static float average(int[] input) {
        float sum = 0f;
        for (int number : input) {
            sum = sum + number;
        }
        return sum / input.length;
    }

    /**
     *
     * String[] names = {"john" , "michael" , "dora" , "philip" , "ilena" , "palena" , "fahry"}
     * String nameToSearch = "philip";
     * Create a method that will tell the position of name of the given array
     * If name present in the names-array, tel user the position (i.e. index+1) else say, name not present
     *
     * philip is on position-4
     * happy is not present in the array
     *
     */

     public static String position(String[] namesArray, String nameToSearch)
     {
        int position=0;
        String result = "";
        for (int i=0 ; i < namesArray.length ; i++) {
            if(namesArray[i].equalsIgnoreCase(nameToSearch)) {
                position = i+1;
                break;
            }
        }
        if(position>0)
        {
            result = nameToSearch +" is on position-"+ position;
        }
        else {
            result = nameToSearch + " is on position-" + position;
        }
        return result;
        }
    /**
     *Create a method to find maximum value in the given int-array
     * int[] numbers = {45, 22, 11, 65, 189, 91, 100, 81};
     *
             * Maximum value in the given array: 189
            */
    public static int getMaxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i=1; i<numbers.length; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }

        }
        return max;
    }


    /**
     * Create a method that will tell the name of student with maximum marks/score.
     * int[] scores = {90, 89, 191, 100, 81};
     * String[] names = {"Happy", "Peace", "Jesse", "Kaitlin", "Lucky"};
     *
     * Jesse scored the maximum score(191)
     */
    public static String findTopper(int[] scores, String[] names) {
        int max = scores[0];
        int scoreIndex=0;
        String topperResult = "";
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                scoreIndex = i;
            }
        }
        topperResult = names[scoreIndex] + " scored the maximum score (" + max + ")";
        return topperResult;
    }
}







