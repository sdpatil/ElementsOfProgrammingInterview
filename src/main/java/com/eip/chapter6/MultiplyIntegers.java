package com.eip.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class MultiplyIntegers {


    public List<Integer> multiply(List<Integer> num1, List<Integer> num2) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(num1.size() + num2.size(), 0));
        // Remove sign if its there
        final int sign = num1.get(0) < 0 ^ num2.get(0) < 0 ? -1 : 1;
        num1.set(0, Math.abs(num1.get(0)));
        num2.set(0, Math.abs(num2.get(0)));

        /**
         * This loop is where most of the actual work happens, it starts from the back
         */
        for (int i = num1.size() - 1; i >= 0; i--) {
            for (int j = num2.size() - 1; j >= 0; j--) {
                //First multiply digit from second number with digit from first number
                result.set(i + j + 1, result.get(i + j + 1) + num1.get(i) * num2.get(j));
                // If the result is more than 10 divide it by 10 and carry the remainder to one digit before
                result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
                // Take 10's remainder of the digit that you just calculated
                result.set(i + j + 1, result.get(i + j + 1) % 10);
            }
        }
        //Take out leading zeros
        int first_not_zero = 0;
        while (first_not_zero < result.size() && result.get(first_not_zero) == 0)
            ++first_not_zero;

        result = result.subList(first_not_zero, result.size());
        if (result.isEmpty())
            return Arrays.asList(0);

        result.set(0, result.get(0) * sign);
        return result;
    }


}
