package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class KLargestInBinaryHeapTest {
    KLargestInBinaryHeap kLargestInBinaryHeap;

    @Before
    public void setup(){
        kLargestInBinaryHeap = new KLargestInBinaryHeap();
    }

    @Test
    public void simpleTest(){
        List<Integer> heapList = Arrays.asList(561,314,401,28,156,359,271,11,3);
        System.out.println(heapList);
        List<Integer> returnList = kLargestInBinaryHeap.kLargestInBinaryHeap(heapList,4);
        assert returnList.size() == 4;
        assert returnList.get(0) == 561;
        assert returnList.get(1) == 401;
        assert returnList.get(2) == 359;
        assert returnList.get(3) == 314;

        System.out.println(returnList);
    }
}
