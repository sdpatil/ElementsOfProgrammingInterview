package com.eip.chapter7;

/**
 * Created by sunilpatil on 3/13/17.
 */
public class RabinKarpSubString {

    public int rabinKarp(String searchString, String text) {
        if (searchString.length() > text.length())
            return -1;

        int m = searchString.length();
        int n = text.length();

        long searchStringHash = createHash(searchString.toCharArray(), searchString.length() - 1);
        long textHash = createHash(text.toCharArray(), searchString.length() - 1);

        for (int i = 1; i <= n - m + 1; i++) {

         //   if(searchStringHash == textHash && checkEqual(text, i-1, i + m-2))
        }
        return -1;
    }

    private static final int prime = 3;

    private long createHash(char[] str, int end) {
        long hash = 0;
        for (int i = 0; i <= end; i++) {
            hash = (long) (hash + str[i] * Math.pow(prime, i));
        }
        return hash;
    }

    private boolean checkEqual(char str1[],int start1,int end1, char str2[],int start2,int end2){
        if(end1 - start1 != end2 - start2) {
            return false;
        }
        while(start1 <= end1 && start2 <= end2){
            if(str1[start1] != str2[start2]){
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }

}
