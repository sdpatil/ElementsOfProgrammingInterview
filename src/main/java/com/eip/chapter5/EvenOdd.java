package com.eip.chapter5;

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

    public void evenOdd(int[] i){
        int nextEven = 0, nextOdd = i.length-1;
        while(nextEven < nextOdd){
            if(i[nextEven] %2 == 0)
                nextEven++;
            else{
                int temp = i[nextEven];
                i[nextEven] = i[nextOdd];
                i[nextOdd--] = temp;
            }
        }
    }
}
