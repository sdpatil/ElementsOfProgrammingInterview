package com.eip.chapter7;

/**
 * Problem: Given a string check whether it is palindromic or not
 * Solution: Start 2 pointers one from start other from end and keep traversing inward till
 * they meet to check if the characters are same or not
 *
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
