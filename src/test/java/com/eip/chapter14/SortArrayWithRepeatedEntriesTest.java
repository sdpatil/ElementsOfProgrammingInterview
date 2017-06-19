package com.eip.chapter14;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 3/12/17.
 */
public class SortArrayWithRepeatedEntriesTest {
    SortArrayWithRepeatedEntries sortArrayWithRepeatedEntries;

    @Before
    public void setup(){
        sortArrayWithRepeatedEntries = new SortArrayWithRepeatedEntries();
    }

    @Test
    public void simpleTest(){
        List<SortArrayWithRepeatedEntries.Person> personList =
                Arrays.asList(
                        new SortArrayWithRepeatedEntries.Person("Greg",14),
                        new SortArrayWithRepeatedEntries.Person("John",12),
                        new SortArrayWithRepeatedEntries.Person("Andy",16),
                        new SortArrayWithRepeatedEntries.Person("Jim",13),
                        new SortArrayWithRepeatedEntries.Person("Phil",12),
                        new SortArrayWithRepeatedEntries.Person("Bob",13),
                        new SortArrayWithRepeatedEntries.Person("Chip",13),
                        new SortArrayWithRepeatedEntries.Person("Tim",14)
                        );
        sortArrayWithRepeatedEntries.groupByAge(personList);
        System.out.println(personList);
    }
}
