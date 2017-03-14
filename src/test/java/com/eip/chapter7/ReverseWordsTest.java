package com.eip.chapter7;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class ReverseWordsTest {
    ReverseWords reverseWords;

    @Before
    public void setup(){
        reverseWords = new ReverseWords();
    }

    @Test
    public void simpleTest(){
        char[] c = "Alice likes Bob".toCharArray();
        System.out.println(Arrays.toString(c));

        reverseWords.reverseWords(c);
        System.out.println(Arrays.toString(c));
    }

    @Test
    public void reverseTest(){
        char[] c = "Sunil".toCharArray();
        System.out.println(new String(c));
        reverseWords.reverse(c,0,4);
        System.out.println(new String(c));

        char[] c1 = "Sunil Patil".toCharArray();
        reverseWords.reverse(c1,0,4);
        System.out.println(new String(c1));
    }




}
