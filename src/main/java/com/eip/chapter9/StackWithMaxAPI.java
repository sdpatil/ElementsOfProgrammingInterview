package com.eip.chapter9;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class StackWithMaxAPI {
    private static class ElementsWithCachedMax{
        public Integer element;
        public Integer max;

        public ElementsWithCachedMax(Integer element, Integer max) {
            this.element = element;
            this.max = max;
        }
    }

    private Stack<ElementsWithCachedMax> stackWithCache = new Stack<ElementsWithCachedMax>();
    public boolean isEmpty(){
        return stackWithCache.isEmpty();
    }

    public Integer max(){
        return stackWithCache.peek().max;
    }

    public Integer pop(){
        return stackWithCache.pop().element;
    }

    public void push(Integer x){
        if(stackWithCache.isEmpty()) {
            stackWithCache.push(new ElementsWithCachedMax(x,x));
        }else{
            int max = Math.max(stackWithCache.peek().max,x);
            stackWithCache.push(new ElementsWithCachedMax(x,max));
        }
    }


}
