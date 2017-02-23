package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class FindNearestRepeatedEntriesTest {
    FindNearestRepeatedEntries findNearestRepeatedEntries;

    @Before
    public void setup(){
        findNearestRepeatedEntries = new FindNearestRepeatedEntries();
    }

    @Test
    public void simpleTest(){
        List<String> paragraph = Arrays.asList("All","work","and","no","play","makes","for","no","work","no","fun","and","no","results");
        assert findNearestRepeatedEntries.findNearestRepeatedEntries(paragraph) ==2;
    }
}
