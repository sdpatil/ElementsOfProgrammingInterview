package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class PlusOne {

    public static List<Integer> plusOne(List<Integer> A){
        List<Integer> returnList = new ArrayList<Integer>();

        int carry = 0;
        for(int i = A.size()-1; i >=0 ; i--){
            int currentDigit = A.get(i) ;
            if(i == A.size()-1){
                currentDigit = currentDigit+1;
            }else{
                currentDigit = currentDigit + carry;
            }
            if(currentDigit> 9){
                carry = currentDigit /10;
                currentDigit = currentDigit % 10;
            }else{
                carry =0;
            }
            returnList.add(currentDigit);
        }
        if(carry != 0)
            returnList.add(carry);
        Collections.reverse(returnList);
        return returnList;
    }
}
