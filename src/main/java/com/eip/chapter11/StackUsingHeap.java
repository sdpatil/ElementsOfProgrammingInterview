package com.eip.chapter11;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 2/14/17.
 */
public class StackUsingHeap {
    private static class ValueWithRank{
        Integer value;
        Integer rank;

        public ValueWithRank( Integer rank,Integer value) {
            this.value = value;
            this.rank = rank;
        }
    }

    public StackUsingHeap(){
        queue =new PriorityQueue<ValueWithRank>(16, new Comparator<ValueWithRank>() {
            public int compare(ValueWithRank o1, ValueWithRank o2) {
                return Integer.compare(o1.value, o2.value);
            }
        });
    }
    PriorityQueue<ValueWithRank> queue = null;
    private int insertionOrder = 0;

    public void push(Integer x){
        queue.add(new ValueWithRank(insertionOrder++,x));
    }

    public Integer pop() throws NoSuchElementException{
        return queue.poll().value;
    }

    public Integer peek(){
        return queue.peek().value;

    }
}
