package com.eip.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/7/17.
 */
public class RemoveKeyTest {
    RemoveKey removeKey ;

    @Before
    public void setup(){
        removeKey = new RemoveKey();
    }

    @Test
    public void simpleTest(){

        int[] A = new int[]{1,2,3,4,5};
        int removeIndex = removeKey.removeKey(A,3);
        assert removeIndex == 4;
        int[] result = new int[] {1,2,4,5,5};
        assert Arrays.equals(A,result);
    }

    @Test
    public void removeFirstElementTest(){
        int[] A = new int[]{1,2,1,4,5};
        int removeIndex = removeKey.removeKey(A,1);
        assert removeIndex == 3;
        int[] result = new int[] {2,4,5,4,5};
        assert Arrays.equals(A,result);
    }

    @Test
    public void removeNonExistingElementTest(){
        int[] A = new int[]{1,2,1,4,5};
        int removeIndex = removeKey.removeKey(A,6);
        assert removeIndex == 5;
        int[] result = new int[] {1,2,1,4,5};

        assert Arrays.equals(A,result);
    }

}
