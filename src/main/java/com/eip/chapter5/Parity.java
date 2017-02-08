package com.eip.chapter5;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class Parity {
    public short parity2(int x){
        short result = 0;
        while(x != 0){
            result ^= (x&1);
            x >>=1;
        }
        return result;
    }

    public short parity(int x){
        short result = 0;
        while (x != 0){
            result ^=1;
            x &= ~(x-1);

        }
        return result;
    }
}
