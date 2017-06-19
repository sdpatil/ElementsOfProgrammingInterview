package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class PalinDrome {

    public boolean isPalinDrome2(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            if (c[start] != c[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    /*
    This method checks if a sentence is palindromic
    Ex. A man, a canal, Panama is palindromic but
        "Ray a Ray" is not
     */
    public boolean isPalinDrome(String s) {
        char[] c = s.toCharArray();
        int start = 0 ;
        int end = c.length-1;
        // Start from both ends of the string
        while (start < end){
            // Ignore all non characters or digits
            while ( start < end && !Character.isLetterOrDigit(c[start]))
                start++;
            //Ignore all non-characters or digits
            while ( start < end && !Character.isLetterOrDigit(c[end]))
                end--;
            // Check if the two characters are same ignoring case, if not its not palindromic
            if(Character.toLowerCase(c[start++]) != Character.toLowerCase(c[end--]))
                return false;
        }
        return true;
    }
}