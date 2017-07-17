package com.eip.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class Parity {
    public static void  main(String[] argv){
        Parity parity = new Parity();
        for (int i = 0; i < 100; i++)
            System.out.println( i+" "+ parity.parity(i) +" " + parity.parity2(i) + " " + parity.parity3(i));
    }

    /*
    Problem: Calculate parity of a long, Parity is 0 if the number
    has even number of 1's in it, and 1 if it has odd number of 1's in it

    Solution :- We can keep taking out the last bit one at a time and
    use it to flip result on and off, whatever is left at the end
    is the result
     */
    public short parity(long x){
        short result = 0;
        while (x != 0){
            long lastBit = x&1;
            x = x >>>1;
           result =(short) (result ^ lastBit);
        }
        return result;
    }

    /*
        Solution: In this solution instead of getting last bit one at a time
        we get the last bit set to 1 at a time, that way the parity could be computed
        faster
     */
    public short parity2(long x){
        short result = 0;
        while (x !=0){
            result =(short) (result^1);
            x &= (x-1);
        }
        return result;
    }

    /*
        Solution: In this case calculate parity of 8 bits at a time and cache the result
     */
    Map<Byte,Integer> parityMap = new HashMap<>();
    public int parity3(long x){
        byte[] bytes = new byte[8];
        for(int i = 0; i < 8 ; i++){
            bytes[i] = (byte) ((x >>> 8 * i) & 0xFF);
        }
        int result = 0;
        for(int i = 0 ; i < 8 ; i++)
            result = result ^ parityByte(bytes[i]);

        return result;
    }

    public int parityByte(byte x){
        Integer value = parityMap.get(x);
        if(value != null)
            return value;
        value =0;
        while (x != 0){
            value = value^1;
            x &= (x-1);
        }
        return value;
    }
}
