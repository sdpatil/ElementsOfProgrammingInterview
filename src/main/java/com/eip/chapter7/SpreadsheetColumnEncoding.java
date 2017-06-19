package com.eip.chapter7;

/**
 * Created by sunilpatil on 2/8/17.
 */
public class SpreadsheetColumnEncoding {

    /**
     * This method is used to convert Spread sheet column number into normal int. Basic idea is that
     * spread sheet columns use 26 alphabets and this is like base 26 conversion
     */
    public int ssDecodeColID(String col){
        int returnValue = 0;
        char[] c = col.toCharArray();
        for(int i = 0 ; i < c.length ;i++){
            returnValue = returnValue * 26 + charToInt(c[i]);
        }
        return returnValue;
    }

    public int ssDecodeColID2(String col){
        int returnValue = 0;
        char[] c = col.toCharArray();
        for(int i = 0 ; i < c.length ;i++){
            returnValue = charToInt(c[i]) + returnValue*26;
        }
        return returnValue;
    }

    public int ssDecodeColIDA0(String col){
        int returnValue = 0;
        char[] c = col.toCharArray();
        for(int i = 0 ; i < c.length ;i++){
            returnValue = charToIntA0(c[i]) + returnValue*26;
        }
        return returnValue;
    }

    //Convert 'A' to 1, 'B' to 2,..
    public int charToInt(char c){
        return c - 'A' +1;
    }

    public int charToIntA0(char c){
        return c - 'A' ;
    }
}
