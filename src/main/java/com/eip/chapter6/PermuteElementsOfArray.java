package com.eip.chapter6;

import java.util.List;

/**
 * Created by sunilpatil on 3/7/17.
 */
public class PermuteElementsOfArray {

    public void applyPermutations(List<Integer> perm, List<Character> A){
        for(int i = 0 ; i < perm.size(); i++){

            swap(A,i, perm.get(i));
        }
    }

    private void swap(List<Character> c, int first, int second ){
        Character temp = c.get(first);
        c.set(first, c.get(second));
        c.set(second, temp);
    }
}
