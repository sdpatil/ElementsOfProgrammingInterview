package com.eip.chapter14;

import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class RemoveNameDuplicates {
    public static class Name implements Comparable<Name>{
        String firstName;
        String lastName;
        public Name(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public int compareTo(Name o) {
            int cmpFirst = firstName.compareTo(o.firstName);
            if(cmpFirst != 0)
                return cmpFirst;

            return lastName.compareTo(o.lastName);
        }
        @Override
        public String toString() {
            return "Name{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    /*
    Problem: This question is about how to remove objects with same first name
    Solution: First sort the collection based on firstName so that records with same first name appear
    next to each other. Then iterate through the collection checking if first name is same for two consecutive entries
    if yes dont copy it to original entry
     */
    public List<Name> eliminateDuplicate(List<Name> A) {
        Collections.sort(A);
        int writeIndex = 1;
        for (int i = 1; i < A.size(); i++) {
            if (!A.get(i).firstName.equals(A.get(i - 1).firstName)) {
                A.set(writeIndex++, A.get(i));
            }
        }
        //Remove the remaining entries
        return A.subList(0, writeIndex);
    }
}
