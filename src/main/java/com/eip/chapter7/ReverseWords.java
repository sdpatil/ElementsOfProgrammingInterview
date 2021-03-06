package com.eip.chapter7;

/**
 * Problem: This method is used to reverse a sentence Ex. "Alice likes Bob" should be reversed to
 "Bob likes Alice"
 */
public class ReverseWords {

    /**
     Solution: - Basic idea is simple first reverse all characters in string, then find all the words and
     reverse individual words
     */
    public void reverseWords(char[] input) {
        //First reverse the whole string
        reverse(input, 0, input.length-1);
        int startOfWord = 0;
        int endOfWord = input.length-1;

        //Now iterate through string to find word and reverse each word at a time
        for(int i = 0 ; i < input.length; i++){
            if(input[i] == ' '){
                endOfWord = i-1;
                reverse(input,startOfWord,endOfWord);
                startOfWord = i+1;
            }
        }
    }

    /**
     * This method can reverse all characters in char array starting between start and end index
     */
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
