package com.eip.chapter14;

import java.util.List;

/**
 * Created by sunilpatil on 3/12/17.
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

    }
}
