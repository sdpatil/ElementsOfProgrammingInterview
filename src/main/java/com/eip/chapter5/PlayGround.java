package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class PlayGround {

    public static void main(String[] argv) {
      System.out.println(Integer.toBinaryString(20) + " "
              + Integer.toBinaryString(clearLowestSetBit(20)));
        System.out.println(Integer.toBinaryString(16) + " "
                + Integer.toBinaryString(getLowestSetBit(16)));

    }

    private static int clearLowestSetBit(int x){
        return x & (x-1);
    }

    private static int getLowestSetBit(int x){
        return x & ~(x-1);
    }
}
