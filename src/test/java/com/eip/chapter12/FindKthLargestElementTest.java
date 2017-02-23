package com.eip.chapter12;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/22/17.
 */
public class FindKthLargestElementTest {
    FindKthLargestElement findKthLargestElement;

    @Before
    public void setup(){
        findKthLargestElement = new FindKthLargestElement();
    }

    @Test
    public void testPartition(){
        int[] A = new int[]{3,2,1,5,4};
        System.out.println(Arrays.toString(A));

        System.out.println(findKthLargestElement.partition(A,0,4));
        System.out.println(Arrays.toString(A));
    }

    @Test
    public void largestTest(){
        int[] A = new int[]{3,2,1,5,4};
        assert findKthLargestElement.findKth(A,5) ==5;
    }

    @Test
    public void middleTest(){
        int[] A = new int[]{3,2,1,5,4};
        assert findKthLargestElement.findKth(A,3) ==3;

    }

    @Test
    public void smallestTest(){
        int[] A = new int[]{3,2,1,5,4};
        assert findKthLargestElement.findKth(A,1) ==1;
    }

    @Test
    public void nonExsistentTest(){
        int[] A = new int[]{3,2,1,5,4};
        assert findKthLargestElement.findKth(A,6) ==-1 ;
    }
}
