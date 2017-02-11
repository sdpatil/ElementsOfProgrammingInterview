package com.eip.chapter8;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/9/17.
 */
public class PlayGround {

    public static void main(String[] argv){
        System.out.println(Arrays.asList(1,2,3,4));
        testVariable(1,2,3,4,5);

        Object s = Arrays.asList(1,2,3,4);
        System.out.println(s.getClass());
    }

    public static void testVariable(int... s){
        System.out.println(s.length);
    }
}
