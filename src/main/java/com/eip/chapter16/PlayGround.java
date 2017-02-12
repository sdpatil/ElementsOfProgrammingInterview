package com.eip.chapter16;

/**
 * Created by spatil30 on 2/10/2017.
 */
public class PlayGround {

    public static void main(String[] argv) {
        System.out.println(GCD(156, 36));
    }

    public static long GCD(long x, long y) {
        if (y == 0)
            return x;
        else
            return GCD(y, x % y);
    }
}
