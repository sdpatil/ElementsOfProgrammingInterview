package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/18/17.
 */
public class ThreeSumTest {
    ThreeSum threeSum;

    @Before
    public void setup() {
        threeSum = new ThreeSum();
    }

    @Test
    public void binarySearchTest() {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        assert threeSum.binarySearch(a, 0, a.size() - 1, 7) == 6;
     //   assert threeSum.binarySearch(a, 0, a.size() - 1, 9) == -1;

    }

    @Test
    public void simpleTest() {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        assert threeSum.hasThreeSum(a,8) == 1;
        assert threeSum.hasThreeSum(a,22) == 0;

        //   System.out.println("Number of 3 sums "+threeSum.hasThreeSum(a,8));
        System.out.println("Number of 3 sums "+threeSum.hasThreeSum(a,22));
    }

    @Test
    public void simple2Test() {
        List<Integer> a = Arrays.asList(11,2,5,7,3);

        //   System.out.println("Number of 3 sums "+threeSum.hasThreeSum(a,8));

        assert threeSum.hasThreeSum(a,21) ==0;

        assert threeSum.hasThreeSum(a,22) ==3;

    }


}
