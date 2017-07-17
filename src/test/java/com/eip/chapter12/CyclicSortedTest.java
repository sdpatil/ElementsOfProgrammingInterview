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
    public void ssearchSmallestTest(){
        List<Integer> arrayList = Arrays.asList(368,378,478,550,631,103,203,220,234,279);
        int result = cyclicSorted.searchSmallest(arrayList);
        System.out.print("Result " +result);
        assert result == 5;
    }

    @Test
    public void searchTest(){
        List<Integer> arrayList = Arrays.asList(368,378,478,550,631,103,203,220,234,279);
        int result = cyclicSorted.searchInRotatedArray(arrayList,220);
        System.out.print("Result " +result);
        assert result == 7;

        result = cyclicSorted.searchInRotatedArray(arrayList,550);
        System.out.print("Result " +result);
        assert result == 3;

        result = cyclicSorted.searchInRotatedArray(arrayList,551);
        System.out.print("Result " +result);
        assert result == -1;


    }

    @Test
    public void searchSmallestTest(){
        List<Integer> arrayList = Arrays.asList(368,378,478,550,631,103,203,220,234,279);
        int result = cyclicSorted.searchInRotatedArray(arrayList,103);
        System.out.print("Result " +result);
        assert result == 5;
    }

    @Test
    public void searchLargestTest(){
        List<Integer> arrayList = Arrays.asList(368,378,478,550,631,103,203,220,234,279);
        int result = cyclicSorted.searchInRotatedArray(arrayList,631);
        System.out.print("Result " +result);
        assert result == 4;
    }
}
