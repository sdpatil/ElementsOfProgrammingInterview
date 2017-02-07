package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/6/17.
 */

public class DeleteDuplicatesTest {
    DeleteDuplicates deleteDuplicates;

    @Before
    public void setup(){
        deleteDuplicates = new DeleteDuplicates();
    }

    @Test
    public void simpleTest(){
        int[] a = new int[] {2,3,5,5,7,11,11,11,13};
        deleteDuplicates.deleteDuplicate2(a);

        int[] c = new int[] {2,3,5,7,11,13,0,0,0};
        assert Arrays.equals(a,c);
    }

    @Test
    public void noDuplicateTest(){
        int[] a = new int[] {1,2,3};
        deleteDuplicates.deleteDuplicates(a);
        int[] c = new int[] {1,2,3};
        assert Arrays.equals(a,c);
    }

    @Test
    public void allDuplicateTest(){
        int[] a = new int[] {2,2,2};
        deleteDuplicates.deleteDuplicates(a);
        int[] c = new int[] {2,0,0};
        assert Arrays.equals(a,c);
    }
}
