package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/20/17.
 */
public class SearchEntryEqualToIndexTest {
    SearchEntryEqualToIndex searchEntryEqualToIndex;

    @Before
    public void setup(){
        searchEntryEqualToIndex = new SearchEntryEqualToIndex();
    }

    @Test
    public void simpleTest(){
        List<Integer> list = Arrays.asList(-2,0,2,3,6,7,9);
        assert searchEntryEqualToIndex.searchEntryEqualToItsIndex(list) ==3;
    }


    @Test
    public void negativeTest(){
        List<Integer> list = Arrays.asList(-2,-1,0,1,2,3,6,7,9);
        assert searchEntryEqualToIndex.searchEntryEqualToItsIndex(list) ==-1;
    }
}
