package com.eip.chapter5;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class ReverseBits {

    public long swapBits(int x, int i, int j) {
        int ithBit = x & (1 << i);
        System.out.println("Value of ith bit " + ithBit);
        int jthBit = x & (1 << j);
        System.out.println("Value of ith bit " + jthBit);

        if (ithBit == 0) {
            x = x | (1 << j);
        } else {
            x = x & (1 << j);
        }

        if (jthBit == 0) {
            x = x | (1 << i);

        } else {
            x = x & (1 << i);

        }
        return x;
    }
}
