package com.eip.chapter13;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem: The collatz conjecture is as follows, take any natural number if its odd triple it and add one. if it is
 * even halve it. Repeat the process indefinetly. No matter what number you start with eventually you will end up with 1
 */
public class CollatzConjecture {

    public boolean testCollatzConjecture(int n) {
        HashSet<Long> verifiedNumbers = new HashSet<Long>();
        for (int i = 3; i <= n; i = i+2) {
           Set<Long> sequence = new HashSet<Long>();
           long testI = i;
           while(testI >= i) {
               if (!sequence.add(testI))
                   return false;

               if ((testI % 2) != 0) {
                   if (!verifiedNumbers.add(testI)) {
                       break;
                   }
                   long nextTestI = testI * 3 + 1;
                   if (nextTestI <= testI)
                       throw new ArithmeticException("Collatz sequence overflow for " + testI);
                   testI = nextTestI;
               } else {
                   testI = testI / 2;
               }
           }
        }
        return true;
    }
}
