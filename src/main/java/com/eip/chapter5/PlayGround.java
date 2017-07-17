package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class PlayGround {

    public static void main(String[] argv) {
        int number = 7;
        System.out.println(Integer.toBinaryString(~0));
        System.out.println(6&1);

    }

    /*
        Problem: Given array of integer every element appears twice except one find that number
        Solution: Take xor of all the numbers, the numbers that appear twice will cancel out each
        other only number that would remain is the number that appears only once
     */
    public int findNumber(int[] number){
        int result = 0;
        for(int i = 0; i < number.length ;i++){
            result = result ^ number[i];
        }
        return result;
    }
}
