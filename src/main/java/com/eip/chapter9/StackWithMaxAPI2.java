package com.eip.chapter9;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class StackWithMaxAPI2 {
    private static class MaxWithCount {
        public Integer max;
        public Integer count;

        public MaxWithCount(Integer max, Integer count) {
            this.max = max;
            this.count = count;
        }
    }

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<MaxWithCount> maxWithCounts = new Stack<MaxWithCount>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Integer max() {
        if (!isEmpty()) {
            return maxWithCounts.peek().max;
        } else
            throw new IllegalStateException("Stack is empty");
    }

    public void push(Integer x) {
        stack.push(x);
        if (maxWithCounts.isEmpty()) {
            maxWithCounts.push(new MaxWithCount(x, 1));
        } else {
            Integer max = Math.max(x, maxWithCounts.peek().max);
            if (x == max) {
                if (max == maxWithCounts.peek().max) {
                    if (maxWithCounts.peek().count != 0)
                        maxWithCounts.peek().count = maxWithCounts.peek().count + 1;
                    else
                        maxWithCounts.push(new MaxWithCount(x, 1));

                } else {
                    maxWithCounts.push(new MaxWithCount(max, 1));
                }
            }
        }
    }

    public Integer pop() {
        Integer item = stack.pop();
        if (item == maxWithCounts.peek().max) {
            if (maxWithCounts.peek().count == 1) {
                maxWithCounts.pop();
            } else {
                maxWithCounts.peek().count = maxWithCounts.peek().count - 1;
            }
        }
        return item;
    }

}