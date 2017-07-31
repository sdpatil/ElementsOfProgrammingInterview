package com.eip.chapter7;

/**
 * Problem: This method should implement replace and remove algorithm in which every a be replaced by 2 d's
 * and every b be deleted from string
 */
public class ReplaceAndRemove {


    /**
     Solution: We can solve this problem in 2 phases, in first phase go through array from start to finish
     removing every b also use this opportunity to calculate number of a's
     Then in second phase start from end replacing every a with 2 ds
     */
    public int replaceAndRemove(int size, char[] c) {
        int writeIndex =0;
        int aCount = 0 ;
        // In first pass remove all the b's and count number of a's
        for(int i = 0 ; i < c.length ;i++){
            if(c[i] != 'b')
                c[writeIndex++] = c[i];
            if (c[i] == 'a')
                aCount++;
        }

        // Move writeIndex to include number of a's (One additional characeter for each a)
        int curIndex = writeIndex-1;
        writeIndex  = writeIndex+ aCount -1;
        final  int finalSize = writeIndex+1;
        //Now start filling from back copy one character at a time
        while (curIndex >=0 ){

            if(c[curIndex] == 'a'){
                c[writeIndex--] ='d';
                c[writeIndex--] ='d';
            }else
                c[writeIndex--] = c[curIndex];

            curIndex--;
        }
         return finalSize;
    }

}
