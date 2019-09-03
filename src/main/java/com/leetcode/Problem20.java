package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Problem20 {
    public boolean isValid(String s) {
        if (s.length() == 1)
            return false;
        Deque<Character> charStack = new LinkedList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (charStack.isEmpty())
                charStack.addFirst(chars[i]);
            else if (isClosingBrace(chars[i])) {
                char openingBrace = charStack.peekFirst();
                if (!matchingClosingBrace(openingBrace, chars[i]))
                    return false;
                else
                    charStack.removeFirst();
            } else
                charStack.addFirst(chars[i]);
        }
        return charStack.isEmpty();
    }

    private boolean isClosingBrace(char c) {
        if (c == ')' || c == ']' || c == '}')
            return true;
        return false;
    }

    private boolean matchingClosingBrace(char first, char second) {
        if (first == '(' && second == ')')
            return true;
        else if (first == '[' && second == ']')
            return true;
        else if (first == '{' && second == '}')
            return true;
        return false;
    }
}
