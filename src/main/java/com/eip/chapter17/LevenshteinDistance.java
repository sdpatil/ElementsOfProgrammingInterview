package com.eip.chapter17;

import java.util.Arrays;

/**
 * Created by sunilpatil on 2/26/17.
 */
public class LevenshteinDistance {

    public int levenshteinDistanceDP(String A, String B) {
        int[][] dpTable = new int[A.length()+1][B.length()+1];
        dpTable[0][0] = 0;

        for(int i = 0; i < dpTable.length ; i++)
            dpTable[i][0] = i;

        for(int i = 0 ; i < dpTable[0].length ; i++)
            dpTable[0][i] = i;

        for(int i = 1 ; i <= A.length() ; i++){
            for(int j = 1 ; j <= B.length() ; j++){
                if(A.charAt(i-1) == B.charAt(j-1)){
                    dpTable[i][j] = dpTable[i-1][j-1];
                }else{
                    dpTable[i][j] = Math.min(dpTable[i-1][j-1], Math.min(dpTable[i-1][j],dpTable[i][j-1])) +1;
                }
            }
        }
        for(int[] dpRow: dpTable)
            System.out.println(Arrays.toString(dpRow));
        return dpTable[A.length()][B.length()];
    }

        public int levenshteinDistance2(String A, String B){
        int[][] distanceBetweenPrefixes = new int[A.length()][B.length()];
        for(int[] row: distanceBetweenPrefixes){
            Arrays.fill(row,-1);
        }
        return computeDistanceBetweenPrefixes(A,A.length()-1, B, B.length()-1, distanceBetweenPrefixes);
    }

    public int computeDistanceBetweenPrefixes(String A, int A_idx, String B, int B_idx, int[][] distanceBetweenPrefixes){
        return 0;
    }
    public int levenshteinDistance(String A, String B){
        int[][] temp = new int[A.length()+1][B.length()+1];
        for(int i = 0; i < temp[0].length;i++)
            temp[0][i] =i;

        for(int i =0; i < temp.length; i++)
            temp[i][0] =i;

        for(int i = 1; i <= A.length();i++){
            for(int j =1; j <= B.length(); j++){
                if(A.charAt(i-1) == B.charAt(j-1))
                    temp[i][j] = temp[i-1][j-1];
                else
                    temp[i][j] = 1+ min(temp[i-1][j-1],temp[i-1][j],temp[i][j-1]);
            }
        }

        return temp[A.length()][B.length()];
    }

    private int min(int a, int b, int c){
       int f = Math.min(a,b);
       return Math.min(f,c);
    }
}
