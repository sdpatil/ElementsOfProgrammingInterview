package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 4/1/17.
 */
public class TowerOfHanoiTest {
    TowerOfHanoi towerOfHanoi;

    @Before
    public void setup(){
        towerOfHanoi = new TowerOfHanoi();
    }

    @Test
    public void threeTest(){
        towerOfHanoi.computeTowerOfHanoi(5);
    }
    @Test
    public void fiveTest(){
        towerOfHanoi.computeTowerOfHanoi(5);
    }
}
