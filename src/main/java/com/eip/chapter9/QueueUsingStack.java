package com.eip.chapter9;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class QueueUsingStack {
    private Stack<Integer> enq = new Stack<Integer>();
    private Stack<Integer> deq = new Stack<Integer>();


    public void enqueue(Integer x){
        enq.push(x);
    }

    public Integer dequeue(){
        if(deq.isEmpty()){
            while(!enq.isEmpty()){
                deq.push(enq.pop());

            }
        }
        if(!deq.isEmpty())
            return deq.pop();
        throw new NoSuchElementException("Queue is empty");
    }
}
