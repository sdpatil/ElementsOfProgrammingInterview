package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class PlayGround {

    public static void main(String[] argv) {
        System.out.println(Double.valueOf("1.23"));
        System.out.println(Character.getNumericValue('a'));

        int a = 60;
        int b = 13;

        printNumber(a);
        printNumber(b);


        int result = a >> 3 ;
        printNumber(result);
    }

    private static void printNumber(int n) {
        System.out.printf("Decimal " + n + "\t%64s \n", Integer.toBinaryString(n));

    }

    public static short parity(long x) {
        short result = 0;
        while (x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }
        return result;
    }
}
