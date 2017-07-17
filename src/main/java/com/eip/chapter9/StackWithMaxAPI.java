package com.eip.chapter9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Problem :- Implement a stack that returns max
 * Solution:- Basic idea is use the same stack to maintain the max value seen so far
 */
public class StackWithMaxAPI {

    private Stack<Integer> stackWithCache = new Stack<Integer>();
    int currentMax = Integer.MIN_VALUE;
    public boolean isEmpty(){
        return stackWithCache.isEmpty();
    }

    public Integer max(){
        return currentMax;
    }
    /*
        If the value your popping same as that of the current max, pop last biggest element from stack and store it in
        current max
     */
    public Integer pop(){
        int returnValue = stackWithCache.pop();
        if(returnValue == currentMax){
            currentMax = stackWithCache.pop();
        }
        return returnValue;
    }

    /*
        If the value that your inserting is bigger than current max, put it on stack before putting
        current entry on the stack
     */
    public void push(Integer x){
        if(x> currentMax){
            stackWithCache.push(currentMax);
            currentMax = x;
        }
        stackWithCache.push(currentMax);
    }


}
