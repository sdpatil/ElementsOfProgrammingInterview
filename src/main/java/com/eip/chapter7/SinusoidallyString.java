package com.eip.chapter7;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class SinusoidallyString {
    public String snakeString(String input){
        StringBuffer snakeString = new StringBuffer();
        for(int i = 1; i < input.length(); i = i+4)
            snakeString.append(input.charAt(i));
        for(int i = 0; i < input.length(); i = i+2)
            snakeString.append(input.charAt(i));
        for(int i = 3; i < input.length(); i = i+4)
            snakeString.append(input.charAt(i));
        return snakeString.toString();
    }
}
