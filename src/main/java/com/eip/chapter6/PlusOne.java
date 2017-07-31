package com.eip.chapter6;


import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class PlusOne {


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