package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class MultiplyIntegers {

    public List<Integer> multiply(List<Integer> num1, List<Integer> num2){
        final int sign = num1.get(0) < 0 ^ num2.get(0) <0  ?-1:1;
        num1.set(0, Math.abs(num1.get(0)));
        num2.set(0, Math.abs(num2.get(0)));

        List<Integer> result = new ArrayList<Integer>(Collections.nCopies(num1.size()+num2.size(),0));

        for(int i = num1.size()-1; i >= 0 ; i--){
            for(int j = num2.size()-1; j >= 0; j--){
                result.set(i+j+1, result.get(i+j+1) + num1.get(i) * num2.get(j) );
                result.set(i+j, result.get(i+j) + result.get(i+j+1)/10);
                result.set(i+j+1, result.get(i+j) + result.get(i+j+1)%10);

            }
        }

        int first_not_zero =0;
        while(first_not_zero < result.size() && result.get(first_not_zero) ==0)
            ++first_not_zero;

        result = result.subList(first_not_zero,result.size());
        if(result.isEmpty())
            return Arrays.asList(0);

        result.set(0, result.get(0)*sign);
        return result;
    }
}
