package com.eip.chapter16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/19/17.
 */
public class PalindromicDecomposition {

    public List<List<String>> palindromePartitioning(String input){
        List<List<String>> result = new ArrayList();
        directedPalindromePartitioning(input,0, new ArrayList(), result);
        return result;
    }

    private void directedPalindromePartitioning(String input, int offset,
                                                List<String> partialPartition,
                                                List<List<String>> result){
        if(offset == input.length()-1){
            result.add(new ArrayList(partialPartition));
            return;
        }

        for(int i = offset+1; i <= input.length(); ++i){
            String prefix = input.substring(offset,i);
            if(isPalindrome(prefix)){
                partialPartition.add(prefix);
                directedPalindromePartitioning(input, i, partialPartition,result);
                partialPartition.remove(partialPartition.size()-1);
            }
        }

    }

    public boolean isPalindrome(String str){
        for (int i = 0, j = str.length()-1; i <j ; i++,j--){
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
