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
    This question is about how to remove duplicates
     */
    public List<Name> eliminateDuplicate(List<Name> A) {
        Collections.sort(A);
        int writeIndex = 1;
        for(int i = 1; i < A.size(); i++){
            if(!A.get(i).firstName.equals(A.get(i-1).firstName)){
                A.set(writeIndex++, A.get(i));
            }
        }
        return A.subList(0,writeIndex );
    }

     /*   public List<Name> eliminateDuplicate2(List<Name> A){
        Collections.sort(A);
        int result = 0;
        for(int i = 1; i < A.size();i++){
            if(!A.get(i).firstName.equals(A.get(result).firstName))
                A.set(++result,A.get(i));
        }

        return A.subList(0,++result);
    }*/
}
