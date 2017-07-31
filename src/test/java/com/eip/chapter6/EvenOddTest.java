package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/5/17.
 */
public class EvenOddTest {
    EvenOdd evenOdd;
    @Before
    public void setup(){
        evenOdd = new EvenOdd();
    }

    @Test
    public void testSimple(){
        int[] a = {1,2,3,4,5,6};
        evenOdd.evenOdd1(a);
        System.out.println(Arrays.toString(a));
        assert Arrays.equals(a,new int[]{6, 2, 4, 3, 5, 1});
    }

    @Test
    public void testOnlyOdd(){
        int[] a = {1,3,5};
        evenOdd.evenOdd1(a);
        System.out.println(Arrays.toString(a));
        assert Arrays.equals(a,new int[]{1,3,5});
    }

    @Test
    public void testOnlyEven(){
        int[] a = {2,4,6,};
        evenOdd.evenOdd1(a);
        System.out.println("After sorting" +Arrays.toString(a));
        assert Arrays.equals(a, new int[] {2,4,6});
    }
}
