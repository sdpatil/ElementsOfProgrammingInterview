package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class StackWithMaxAPITest {
    StackWithMaxAPI2 stackWithMaxAPI;

    @Before
    public void setup(){
        stackWithMaxAPI = new StackWithMaxAPI2();
    }


    @Test
    public void simpleTest(){
        stackWithMaxAPI.push(10);
       assert stackWithMaxAPI.max() == 10;
       stackWithMaxAPI.push(9);
        assert stackWithMaxAPI.max() == 10;
        stackWithMaxAPI.push(11);
        assert stackWithMaxAPI.max() == 11;
        stackWithMaxAPI.pop();
        assert stackWithMaxAPI.max() == 10;

    }

    @Test
    public void duplicateTest(){
        stackWithMaxAPI.push(2);
        assert stackWithMaxAPI.max() == 2;
        stackWithMaxAPI.push(2);
        assert stackWithMaxAPI.max() == 2;
        stackWithMaxAPI.push(1);
        assert stackWithMaxAPI.max() == 2;
        stackWithMaxAPI.push(4);
        assert stackWithMaxAPI.max() == 4;
        stackWithMaxAPI.push(5);
        assert stackWithMaxAPI.max() == 5;
        stackWithMaxAPI.push(5);
        assert stackWithMaxAPI.max() == 5;
        stackWithMaxAPI.push(3);
        assert stackWithMaxAPI.max() == 5;

        assert stackWithMaxAPI.pop() ==3;
        assert stackWithMaxAPI.max() == 5;
        assert stackWithMaxAPI.pop() ==5;
        assert stackWithMaxAPI.max() == 5;
        assert stackWithMaxAPI.pop() ==5;
        assert stackWithMaxAPI.max() == 4;

    }
}
