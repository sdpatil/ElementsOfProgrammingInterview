package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/*
1047. Remove All Adjacent Duplicates In String
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.



Example 1:

Input: "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 */
public class Problem1047 {
    public String removeDuplicates(String S) {
        if(S == null || S.length() == 1)
            return S;

        Deque<Character> charStack = new LinkedList<>();
        char[] chars = S.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            if(charStack.isEmpty())
                charStack.addFirst(chars[i]);
            else if(charStack.peekFirst() == chars[i])
                charStack.removeFirst();
            else
                charStack.addFirst(chars[i]);
        }
        StringBuffer returnStringBuffer = new StringBuffer();
        while (!charStack.isEmpty()) {
            returnStringBuffer.append(charStack.removeFirst());
        }
        return returnStringBuffer.reverse().toString();
    }
}
