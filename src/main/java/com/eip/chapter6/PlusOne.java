package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class PlusOne {

    public static List<Integer> plusOne2(List<Integer> A) {
        List<Integer> returnList = new ArrayList<Integer>();

        int carry = 0;
        for (int i = A.size() - 1; i >= 0; i--) {
            int currentDigit = A.get(i);
            if (i == A.size() - 1) {
                currentDigit = currentDigit + 1;
            } else {
                currentDigit = currentDigit + carry;
            }
            if (currentDigit > 9) {
                carry = currentDigit / 10;
                currentDigit = currentDigit % 10;
            } else {
                carry = 0;
            }
            returnList.add(currentDigit);
        }
        if (carry != 0)
            returnList.add(carry);
        Collections.reverse(returnList);
        return returnList;
    }

    public static void main(String[] argv){
        List<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(9);
        System.out.println(plusOne(nums));
    }

    public static List<Integer> plusOne(List<Integer> A) {
        int length = A.size() -1;
        A.set(length, A.get(length)+1);

        for(int i = length; i >0; i-- ){
            int digit = A.get(i);
           if(digit > 9) {
               A.set(i, digit%10);
               A.set(i-1, A.get(i-1) + digit/10);
           }
        }

        if(A.get(0) >9){
            int digit = A.get(0);
            A.set(0, digit%10 );

            A.add(0, digit/10);
        }
        return A;
    }
}