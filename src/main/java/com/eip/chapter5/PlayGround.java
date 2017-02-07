package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class PlayGround {

    public static void main(String[] argv){
        int input = -16;
        System.out.println(Integer.toBinaryString(input));
        int output = input >>> 4;
        System.out.println(Integer.toBinaryString(output));
        System.out.println(output);
        System.out.println(Integer.MAX_VALUE);

    }
}
