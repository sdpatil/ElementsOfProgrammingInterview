package com.eip.chapter6;

/**
 * Created by sunilpatil on 2/6/17.
 */
public class AddStrings {

    public String addStrings(String first, String second){
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        StringBuffer returnString = new StringBuffer();

        int maxLength = Math.max(firstChar.length, secondChar.length);
        int carry = 0;
        for(int i = 1; i <= maxLength ; i++){
           int currentDigit = carry + charFromEnd(firstChar,i) + charFromEnd(secondChar,i);
            if(currentDigit> 9){
                carry = currentDigit /10;
                currentDigit = currentDigit % 10;
            }else{
                carry =0;
            }
            returnString.append(currentDigit);
        }
        if(carry != 0)
            returnString.append(carry);


        return returnString.reverse().toString();
    }

    private int charFromEnd(char[] A, int index){
        int arrayIndex = A.length - index;
        if(arrayIndex < 0){
            return 0;
        }else{
            return Integer.parseInt(A[arrayIndex]+"");
        }
    }
}
