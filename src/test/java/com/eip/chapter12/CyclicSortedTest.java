package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/21/17.
 */
public class CyclicSortedTest {
    CyclicSorted cyclicSorted;

    @Before
    public void setup(){
        cyclicSorted = new CyclicSorted();
    }

    @Test
    public void simpleTest(){
        List<Integer> arrayList = Arrays.asList(368,378,478,550,631,103,203,220,234,279);
        assert cyclicSorted.searchSmallest(arrayList) == 5;
    }
}
