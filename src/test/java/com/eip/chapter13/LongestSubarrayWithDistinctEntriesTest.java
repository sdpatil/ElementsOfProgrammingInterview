package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class LongestSubarrayWithDistinctEntriesTest {
    LongestSubarrayWithDistinctEntries longestSubarrayWithDistinctEntries;

    @Before
    public void setup(){
        longestSubarrayWithDistinctEntries = new LongestSubarrayWithDistinctEntries();
    }

    @Test
    public void simpleTest(){
        List<Character> characterList = Arrays.asList('f','s','f','e','t','w','e','n','w','e');
        assert longestSubarrayWithDistinctEntries.longestSubarrayWithDistinctEntries(characterList) ==5;
    }
}
