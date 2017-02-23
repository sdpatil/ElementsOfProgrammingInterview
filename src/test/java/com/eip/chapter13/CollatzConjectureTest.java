package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class CollatzConjectureTest {
    CollatzConjecture collatzConjecture;

    @Before
    public void setup(){
        collatzConjecture = new CollatzConjecture();
    }

    @Test
    public void simpleTest(){
        assert collatzConjecture.testCollatzConjecture(11);
    }
}
