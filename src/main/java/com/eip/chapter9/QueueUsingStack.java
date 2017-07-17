package com.eip.chapter9;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Problem :- Implement queue interface using 2 stacks
 *
 * Solution:-  Basic idea is whenever your adding new element add it to first stack
 * When removing element first reverse the whole first stack and keep it in second
 * then every time you ask for new element take it out from second stack, till its empty
 */
public class QueueUsingStack {
    private Stack<Integer> first = new Stack<Integer>();
    private Stack<Integer> second = new Stack<Integer>();

    public void enqueue(int x){
        first.add(x);
    }

    public int dequeue(){
        if(second.isEmpty()){
            while (!first.isEmpty())
                second.push(first.pop());
        }
        if(!second.isEmpty())
            return second.pop();
        throw new NoSuchElementException("");
    }
}
