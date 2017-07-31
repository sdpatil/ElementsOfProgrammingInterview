package com.eip.chapter6;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class EvenOdd {

    public void evenOdd1(int[] i){
        int start = 0;
        int end = i.length -1;
        while(start < end){
            while (start <end && i[start] %2 == 0)
                start++;
            while(start <end && i[end] % 2==1)
                end --;
            int temp = i[start];
            i[start] = i[end];
            i[end] = temp;
            start++;
            end--;
        }
    }

}
