package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/*
155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */
public class Problem155 {
    Deque<Integer> valueStack;
    Deque<MinWithCounter> minStack;
    /** initialize your data structure here. */
    public Problem155() {
        valueStack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        valueStack.addFirst(x);
        if(minStack.isEmpty() || minStack.peekFirst().minValue > x ){
            minStack.addFirst(new MinWithCounter(x,1));
        }else if (minStack.peekFirst().minValue == x){
            minStack.peekFirst().counter = minStack.peekFirst().counter +1;
        }
    }

    public void pop() {
        int popValue = valueStack.removeFirst();
        if(minStack.peekFirst().minValue == popValue){
            if(minStack.peekFirst().counter > 1){
                minStack.peekFirst().counter = minStack.peekFirst().counter - 1;
            }
            else
                minStack.removeFirst();
        }
    }

    public int top() {
        return valueStack.peekFirst();
    }

    public int getMin() {
        return minStack.getFirst().minValue;
    }


    class MinWithCounter{
        int minValue;
        int counter;

        public MinWithCounter() {
        }

        public MinWithCounter(int minValue, int counter) {
            this.minValue = minValue;
            this.counter = counter;
        }
    }
}
