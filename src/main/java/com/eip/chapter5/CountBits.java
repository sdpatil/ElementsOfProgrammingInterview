package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class CountBits {

    public static void main(String[] argv) {
        CountBits cb = new CountBits();
        for (int i = 0; i < 100; i++) {
            System.out.println(cb.countBits(i) + " " + cb.countBits2(i));
        }
    }

    /*
        Problem:- Count number of bits set to 1 in an integer
        Solution:- Basic idea is performing x&1 gives you value of the LSB then performing >>> on it
          will push the last bit out and so on till x becomes 0
     */
    public int countBits(int x) {
        int numberOfBits = 0;
        while (x != 0) {
            numberOfBits = numberOfBits + (x & 1);
            x = x >>> 1;
        }
        return numberOfBits;
    }

    /*
        Solution: This is little more efficient method in which we just remove the last bit that is
        set to 1, that way the loop will go faster
     */
    public int countBits2(int x) {
        int numberOfBits = 0;
        while (x != 0) {
            x = x & (x - 1);
            numberOfBits++;
        }
        return numberOfBits;
    }

}
