package com.eip.chapter19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Problem: Given a dictionary D and 2 strings s and t, write a program to determine if s produces t.
 */
public class TransformOneStringToAnother {

    public static class StringWithDistance{
        public String candidateString;
        public Integer distance;

        public StringWithDistance(String candidateString, Integer distance) {
            this.candidateString = candidateString;
            this.distance = distance;
        }
    }

    public int transformString(Set<String> dictonary, String s, String t){
       Queue<StringWithDistance> q = new LinkedList<>();
       q.add(new StringWithDistance(s,0));
       dictonary.remove(s);

       while (!q.isEmpty()){
           StringWithDistance c = q.poll();
           String currentCandidateString = c.candidateString;
           if(currentCandidateString.equals(t))
               return c.distance;

           for(int i = 0; i < currentCandidateString.length();i++){
               String strStart = i==0 ? "": currentCandidateString.substring(0,i);
               String endStr = i+1 <currentCandidateString.length()? currentCandidateString.substring(i+1):"";

               for(int j = 0 ; j < 26 ; j++){
                   String modStr = strStart + (char)('a'+j) + endStr;
                   if(dictonary.contains(modStr)){
                       dictonary.remove(modStr);
                       q.add(new StringWithDistance(modStr,c.distance+1));
                   }
               }
           }
       }
       return -1;
    }
}
