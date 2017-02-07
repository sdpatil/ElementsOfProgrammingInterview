package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class CountBits {

    public short countBits(int x){
        short numBits = 0;
        while(x != 0){
            numBits  += (x&1);
            x = x >>> 1;
        }
        return numBits;
    }
}
