package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class TestPalindromicity {

    public boolean isPalindrome(String s){
        char[] c = s.toCharArray();
        int start = 0;
        int end = s.length() -1;
        while (start < end){
            while(start< end && !Character.isLetterOrDigit(c[start]))
                start++;
            while(start < end && !Character.isLetterOrDigit(c[end]))
                end--;
            if(Character.toLowerCase(c[start]) != Character.toLowerCase(c[end]) )
                return false;
            start++;
            end--;
        }
        return true;
    }
}
