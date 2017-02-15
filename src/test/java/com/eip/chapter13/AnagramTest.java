package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/13/17.
 */
public class AnagramTest {
    Anagram anagram;

    @Before
    public void setup(){
        anagram = new Anagram();
    }

    @Test
    public void simpleTest(){
        List wordList = Arrays.asList("debitcard","elvis","silent","badcredit","lives","listen","levis");

        List<List<String>> result = anagram.findAnagrams(wordList);
        System.out.println(result);

        assert result.size() == 3;
    }

    @Test
    public void simpleTest2(){
        List wordList = Arrays.asList("logarithmic","algorithmic");

        List<List<String>> result = anagram.findAnagrams(wordList);
        System.out.println(result);

        assert result.size() == 1;
    }
}
