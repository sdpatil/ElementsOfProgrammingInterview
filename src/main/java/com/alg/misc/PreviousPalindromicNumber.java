package com.alg.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/2/17.
 */
public class PreviousPalindromicNumber {

    public static void main(String[] argv) {
        PreviousPalindromicNumber previousPalindromicNumber = new PreviousPalindromicNumber();
        System.out.println(previousPalindromicNumber.prevPalindrome(16));
        System.out.println(previousPalindromicNumber.prevPalindrome(11));
        System.out.println(previousPalindromicNumber.prevPalindrome(1));
    }

    int prevPalindrome(int x) {
        for (int i = x - 1; i >= 0; i--) {
            if (isPalinDrome(i))
                return i;
        }
        return -1;
    }

    private boolean isPalinDrome(int x) {
        char[] digits = Integer.toString(x).toCharArray();
        int start = 0;
        int end = digits.length - 1;
        while (start < end) {
            if (digits[start] != digits[end])
                return false;
            start++;
            end--;
        }

        return true;
    }

}
