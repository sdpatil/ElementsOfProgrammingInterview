package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class ReplaceAndRemove {

    public int replaceAndRemove(int size, char[] c){
        int countA = 0;
        int writeIndex = 0;
        for(int i = 0; i < size;i++){
            if(c[i] != 'b'){
                c[writeIndex++] = c[i];
            }
            if(c[i] =='a')
                countA++;
        }
        int currIndex = writeIndex-1;
        writeIndex = writeIndex + countA-1;
        int newLength = writeIndex+1;
        while (currIndex>=0){
            if (c[currIndex] == 'a'){
                c[writeIndex--] ='d';
                c[writeIndex--] ='d';
            }else{
                c[writeIndex--] = c[currIndex];
            }
            --currIndex;
       }



        return newLength;
    }
}
