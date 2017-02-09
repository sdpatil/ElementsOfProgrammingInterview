package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class PalinDrome {

    public boolean isPalinDrome(String s){
        char[] c = s.toCharArray();
        int start  = 0 ;
        int end = c.length -1;
        while(start < end){
            if(c[start] != c[end] )
                return false;
            start++;
            end--;
        }
        return true;
    }
}
