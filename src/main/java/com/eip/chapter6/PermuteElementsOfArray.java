package com.eip.chapter6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class PermuteElementsOfArray {

    public static void main(String[] argv){
        List<Character> chars = Arrays.asList('A','B','C','D');
        List<Integer> perms = Arrays.asList(3,1,2,0);
        PermuteElementsOfArray p = new PermuteElementsOfArray();
        p.applyPermutations(perms,chars);
        System.out.println(chars);
    }

    public void applyPermutations(List<Integer> perm, List<Character> A){
        for(int i = 0 ; i < A.size(); i++){
            int next = i;
            while (perm.get(next) >= 0){
                Collections.swap(A,i, perm.get(next));
                int temp = perm.get(next);
                perm.set(next, perm.get(next) - perm.size());
                next = temp;
            }
        }
        for(int i = 0 ; i < perm.size(); i++){
            perm.set(i, perm.get(i) + perm.size());
        }
    }

}
