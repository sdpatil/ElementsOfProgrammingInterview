package com.eip.chapter11;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class StackUsingHeapTest {
    StackUsingHeap stackUsingHeap;

    @Before
    public void setup() {
        stackUsingHeap = new StackUsingHeap();
    }

    @Test
    public void simpleTest() {
        stackUsingHeap.push(3);
        assert stackUsingHeap.peek() == 3;
        stackUsingHeap.push(2);
        assert stackUsingHeap.peek() == 2;

        stackUsingHeap.push(1);
        assert stackUsingHeap.peek() == 1;

        assert stackUsingHeap.pop() == 1;
        assert stackUsingHeap.pop() == 2;
        assert stackUsingHeap.pop() == 3;

    }
}
