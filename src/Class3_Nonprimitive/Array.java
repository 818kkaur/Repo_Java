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
        arrInt[3] =43;
        arrInt[2] =45;
        int value2 = arrInt[1];
        System.out.println(value1);
        System.out.println(Arrays.toString(arrInt));
    }
}
