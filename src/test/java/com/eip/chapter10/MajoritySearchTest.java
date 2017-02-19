package com.eip.chapter10;

import com.eip.chapter18.MajoritySearch;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class MajoritySearchTest {
    MajoritySearch majoritySearch;

    @Before
    public void setup(){
        majoritySearch = new MajoritySearch();
    }

    @Test
    public void simpleTest(){
        List<String> list = Arrays.asList("b","a","c","a","a","b","a","a","c","a");
        assert majoritySearch.majoritySearch(list.iterator()).equals("a");
    }
}
