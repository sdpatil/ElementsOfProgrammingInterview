package com.eip.chapter9;

import java.util.Stack;

/**
 * Problem: Check parenthesis for balancing
 * Solution: - Use stack to balance paranthesis
 */
public class ParanthesisBalancing {

    public boolean isWellFormed(String s){
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            switch (c){
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if(stack.pop() != '{')
                        return false;
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if(stack.pop() != '(')
                        return false;
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if(stack.pop() != '[')
                        return false;
                    break;
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
