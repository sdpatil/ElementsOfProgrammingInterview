package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class QuickSortTest {
    QuickSort quickSort;

    @Before
    public void setup() {
        quickSort = new QuickSort();
    }


    @Test
    public void testPartition() {
        int[] a = new int[]{3, 1, 6, 5, 2, 0, 4};

        int pivot = quickSort.partition(a, 0, a.length - 1);
        assert pivot == 3;
        assert Arrays.equals(a, new int[]{2, 1, 0, 3, 5, 6, 4});
    }

    @Test
    public void testPartition2() {
        int[] a = new int[]{6, 5, 4, 3, 2, 1, 0};

        int pivot = quickSort.partition(a, 0, a.length - 1);
        assert pivot == 6;
        assert Arrays.equals(a, new int[]{0, 5, 4, 3, 2, 1, 6});
    }

    @Test
    public void testPartition3() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};

        int pivot = quickSort.partition(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
        assert pivot == 0;
        assert Arrays.equals(a, new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    @Test
    public void testSimple() {
        int[] a = new int[]{3, 1, 5, 2, 0};
        quickSort.sort(a);
        assert Arrays.equals(a, new int[]{0, 1, 2, 3, 5});
    }

    @Test
    public void testSimple2() {
        int[] a = new int[]{5, 4, 3, 2, 1};
        quickSort.sort(a);
        assert Arrays.equals(a, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testDuplicate() {
        int[] a = new int[]{5, 3, 4, 3, 4, 3, 2, 4, 2, 1};
        quickSort.sort(a);
        //  assert Arrays.equals(a,new int[] {1,2,3,4,5});
    }
}
