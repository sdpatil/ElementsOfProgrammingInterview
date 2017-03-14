package com.eip.chapter7;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class ReverseWords {
    public void reverseWords(char[] input){
        reverse(input,0,input.length-1);

        int startWord = 0;
        int endOfWord =-1;
        for(int i = 1; i < input.length-1;i++){
            if(input[i] == ' '){
                endOfWord = i-1;
                reverse(input,startWord,endOfWord);
                startWord = i+1;
            }
        }
        reverse(input,startWord,input.length-1);
    }

    public void reverse(char[] c, int start, int end){
        while(start< end){
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start = start+1;
            end = end-1;
        }
    }



}
