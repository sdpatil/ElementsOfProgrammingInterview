package com.eip.chapter9;

import com.eip.chapter6.QueueWithMax;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 4/3/17.
 */
public class QueueWIthMaxTest {
    QueueWithMax<Integer> queueWithMax = new QueueWithMax<>();
    @Test
    public void test() throws Exception {
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(1);
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(2);
        queueWithMax.enqueue(0);

    }

    @Test
    public void testIncreasingOrder() throws Exception {
        queueWithMax.enqueue(1);
        queueWithMax.enqueue(2);
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(4);
        queueWithMax.enqueue(5);


    }

    @Test
    public void testDecreasingOrder() throws Exception {
        queueWithMax.enqueue(5);
        queueWithMax.enqueue(4);
        queueWithMax.enqueue(3);
        queueWithMax.enqueue(2);
        queueWithMax.enqueue(1);

    }
}
