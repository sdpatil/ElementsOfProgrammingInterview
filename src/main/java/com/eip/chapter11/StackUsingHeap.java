package com.eip.chapter11;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/**
 * Stack using Heap has simple idea which is whenver you have to put item, in the stack put it in the heap with
 * insertion number of current item, priority queue takes care of ordering items based on insertion number and given
 * you the one which is inserted last
 */
public class StackUsingHeap {
    // This class is used to store the actual value along with the rank it would be inserted at
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
