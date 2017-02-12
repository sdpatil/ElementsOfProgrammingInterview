package com.eip.chapter18;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/12/17.
 */
public class ChangeMakingTest {
    ChangeMaking changeMaking;

    @Before
    public void setup(){
        changeMaking = new ChangeMaking();
    }

    @Test
    public void makeChangeTest(){
        assert changeMaking.makeChange(47) == 5;

    }

    @Test
    public void coinListTest(){
        List coinList = new ArrayList();
        coinList.add(25);
        coinList.add(10);
        coinList.add(10);
        coinList.add(1);
        coinList.add(1);
        assert changeMaking.coinList(47).equals(coinList);

    }
}
