package com.eip.chapter7;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class LookAndSay {

    public String lookAndSay(int n){
        String lookAndSayString = "1";
        for(int i = 1; i < n; i++){
            lookAndSayString = lookAndSayRec(lookAndSayString);
            System.out.println(i + " " + lookAndSayString);
        }
        return lookAndSayString;
    }

    public String lookAndSayRec(String input){
        StringBuffer lookAndSayString = new StringBuffer();
        char[] c = input.toCharArray();

        char currentNum = c[0];
        int numCount = 1;
        for(int i = 1 ; i < input.length(); i++){
            if(currentNum == c[i])
                numCount++;
            else{
                lookAndSayString.append(numCount);
                lookAndSayString.append(currentNum);
                currentNum = c[i];
                numCount=1;
            }
        }
        lookAndSayString.append(numCount);
        lookAndSayString.append(currentNum);


        return lookAndSayString.toString();
    }
}
