package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class QueueUsingStackTest {
    QueueUsingStack queueUsingStack;

    @Before
    public void setup(){
        queueUsingStack = new QueueUsingStack();
    }

    @Test
    public void simpleTest(){
        queueUsingStack.enqueue(1);
        assert queueUsingStack.dequeue() ==1;

        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);

        assert queueUsingStack.dequeue() == 1;
        assert queueUsingStack.dequeue() == 2;
        assert queueUsingStack.dequeue() == 3;

    }
}
