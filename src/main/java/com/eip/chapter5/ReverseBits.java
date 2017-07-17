package com.eip.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/12/17.
 */
public class ReverseBits {
    long[] precomputedReverse = new long[1 << 16];

    /*
        Problem: Given a number reverse its bits. Ex. given
        1011 you shoudl return 1101

        Solution: Basic idea is simple take out the last bit from number
        by executing n&1, then adding that bit to result and shifting all bits
        in result by 1
     */
    public int reverseBits2(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int takeOutBit = n & 1;
            result = result + takeOutBit;
            n = n >>> 1;
            if (i < 31)
                result = result << 1;
        }
        return result;
    }

    /*
         Problem: Given a number reverse its bits. Ex. given
        1011 you shoudl return 1101
        Solution: This is optimized version which assumes that there could be a more than
        one byte that has same bit pattern compared to other.
        So it breaks integer into 4 bytes then reverses one byte at a time and keeps
        cache of the reversed byte. At the end it adds all the bytes together in reverse
     */
    private final Map<Byte, Integer> cache = new HashMap<>();

    public int reverseBits(int n) {
        byte[] bytes = new byte[4];
        //Break integer into 4 bytes
        for (int i = 0; i < 4; i++)
            bytes[i] = (byte) ((n >>> 8 * i) & 0xFF);

        //Now reverse one byte at a time, add it to result in reverse order
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = result + reverseBits(bytes[i]);
            if (i < 3)
                result = result << 8;
        }
        return result;
    }

    private int reverseByte(byte b) {
        Integer value = cache.get(b);
        if (value != null)
            return value;
        value = 0;
        // This part is same as reverseBits simple but for 8 bits at a time
        for (int i = 0; i < 8; i++) {
            value = value + ((b >>> 1) & 1);
            if (i < 7)
                value = value << 1;
        }
        cache.put(b, value);
        return value;
    }

}
