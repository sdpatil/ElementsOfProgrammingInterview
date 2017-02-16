package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class CircularQueueTest {
    CircularQueue circularQueue;

    @Before
    public void setup() {
        circularQueue = new CircularQueue(3);
    }

    @Test
    public void simpleTest() {
        circularQueue.enqueue(1);
        assert circularQueue.dequeue() == 1;

    }

    @Test
    public void circularLoopTest() {
        circularQueue.enqueue(1);
        assert circularQueue.dequeue() == 1;
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        assert circularQueue.dequeue() == 2;
        assert circularQueue.dequeue() == 3;
        assert circularQueue.dequeue() == 4;
    }

    @Test
    public void expandTest() {
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);

        assert circularQueue.dequeue() == 1;
        assert circularQueue.dequeue() == 2;
        assert circularQueue.dequeue() == 3;
        assert circularQueue.dequeue() == 4;
        assert circularQueue.dequeue() == 5;


    }
}
