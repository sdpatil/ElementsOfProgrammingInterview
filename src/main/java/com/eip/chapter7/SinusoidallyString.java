package com.eip.chapter7;

/**
 * Problem: This method takes a string as input and return it in sinusoidally fashion
     Hello World
     e             l
     H  l   o  w   r   d
     l      o
     e lHloWrdlo
 */
public class SinusoidallyString {
    /*
        Solution:Basic idea here is first string contains 1,5,9 character and second contains 0,2,4 followed by third string
         containing 3,7,11 so we can directly append it like this
     */
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
