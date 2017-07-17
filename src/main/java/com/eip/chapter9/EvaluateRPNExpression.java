package com.eip.chapter9;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 * Problem :- Evaluate expression in reverse polish order notation
 * Solution: - First separate the string into multiple parts based on , and then check if the
 * character is sign if yes pull two operators from stack perform math. operation and push result on the
 * stack, if the pulled character is number put it on stack
 */
public class EvaluateRPNExpression {
    public int eval(String RPNExpression){
        Stack<Integer> evalValues = new Stack<Integer>();
        String[] symbols = RPNExpression.split(",");
        for(int i = 0 ; i < symbols.length ;i++){
            String symbol = symbols[i];
            if(symbol.equals("*")){
                int first = evalValues.pop();
                int second = evalValues.pop();
                evalValues.push(first*second);
            }else if(symbol.equals("/")){
                int first = evalValues.pop();
                int second = evalValues.pop();
                evalValues.push(second/first);
            }else if(symbol.equals("+")){
                int first = evalValues.pop();
                int second = evalValues.pop();
                evalValues.push(second+first);
            }else if(symbol.equals("-")){
                int first = evalValues.pop();
                int second = evalValues.pop();
                evalValues.push(second-first);
            }else{
                evalValues.push(Integer.parseInt(symbol));
            }
        }
        if(evalValues.size() != 1)
            throw new IllegalStateException("Found more than one value on stack");
        System.out.println("Return value " + evalValues.peek());
        return evalValues.pop();
    }
}
