package com.eip.chapter14;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Problem: You are given an array of student objects. Each student has an integer-valued age field that is
 * treated as a key. Rearrange the elements of the array so that students of equal age appear together.
 * The order in which different ages appear is not important
 */
public class SortArrayWithRepeatedEntries {
    static class Person{
        Integer age;
        String name;

        public Person( String name,Integer age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public void groupByAge(List<Person> personList){
        Map<Integer,Integer> ageToCount = new HashMap<>();
        for(Person p: personList){
            if(ageToCount.containsKey(p.age)){
                ageToCount.put(p.age, ageToCount.get(p.age)+1);
            }else{
                ageToCount.put(p.age,1);
            }
        }
        System.out.println("Age to count " + ageToCount);
        Map<Integer,Integer> ageToOffset = new HashMap<>();
        int offset = 0;
        for(Map.Entry<Integer,Integer> kc: ageToCount.entrySet()){
            ageToOffset.put(kc.getKey(),offset);
            offset = offset+kc.getValue();
        }
        System.out.println(ageToOffset);
        while (!ageToOffset.isEmpty()){
            Map.Entry<Integer,Integer> from = ageToOffset.entrySet().iterator().next();
            Integer toAge = personList.get(from.getValue()).age;
            Integer toValue = ageToOffset.get(toAge);
            Collections.swap(personList, from.getValue(),toValue);
            Integer count = ageToCount.get(toAge)-1;
            ageToCount.put(toAge,count);
            if(count >0 ){
                ageToOffset.put(toAge,toValue+1);
            }else
                ageToOffset.remove(toAge);
        }
    }
}
