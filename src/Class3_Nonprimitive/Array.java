package Class3_Nonprimitive;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        int value = arrInt.length;
        System.out.println(value);
        int[] arrInt1 = new int[3];
        int value1 = arrInt.length;
        System.out.println(value);
        arrInt[0] = 12;
        arrInt[1] =45;
        arrInt[2] =43;
      //  arrInt[3] =45;
        int value2 = arrInt[1];
        System.out.println(value1);
        System.out.println(Arrays.toString(arrInt));
        int[] a = num();
        System.out.println(Arrays.toString(a));
        // OR
        for(int i = 0; i <a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static int[] num()
    {
        int [] numbers= {1,3,4,5,6,6,7};
        return numbers;
    }
}
