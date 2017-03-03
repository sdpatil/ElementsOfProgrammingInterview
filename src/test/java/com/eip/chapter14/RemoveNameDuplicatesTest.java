package com.eip.chapter14;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/28/17.
 */
public class RemoveNameDuplicatesTest {
    RemoveNameDuplicates removeNameDuplicates;

    @Before
    public void setup(){
        removeNameDuplicates = new RemoveNameDuplicates();
    }

    @Test
    public void simpleTest(){
        List<RemoveNameDuplicates.Name> namesList = Arrays.asList(
                new RemoveNameDuplicates.Name("Ian","Botham"),
                new RemoveNameDuplicates.Name("David","Gower"),
                 new RemoveNameDuplicates.Name("Ian","Bell"),
             new RemoveNameDuplicates.Name("Ian","Chappell")
                );

        List<RemoveNameDuplicates.Name> resultList =removeNameDuplicates.eliminateDuplicate(namesList);

        System.out.println(resultList);
    }
}
