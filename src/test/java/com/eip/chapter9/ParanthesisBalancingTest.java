package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class ParanthesisBalancingTest {
    ParanthesisBalancing paranthesisBalancing;

    @Before
    public void setup(){
        paranthesisBalancing = new ParanthesisBalancing();
    }

    @Test
    public void simpleTest(){
        assert paranthesisBalancing.isWellFormed("{}()[]");
        assert !paranthesisBalancing.isWellFormed("{}([]");

        assert paranthesisBalancing.isWellFormed("([]){()}");
        assert paranthesisBalancing.isWellFormed("[()[]{()()}]");

        assert !paranthesisBalancing.isWellFormed("{)");
        assert !paranthesisBalancing.isWellFormed("[()[]{()()");

    }
}
