package com.eip.chapter13;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class PlayGround {
    public static void main(String[] argv){
        System.out.println(stringHash("Hello",31));
    }

    public static int stringHash(String str, int modulus){
        int kMult = 999;
        int value = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            value = ( value*kMult+c) % modulus;
        }
        return value;
    }
}
