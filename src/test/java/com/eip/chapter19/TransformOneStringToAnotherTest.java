package com.eip.chapter19;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class TransformOneStringToAnotherTest {
    TransformOneStringToAnother problem = new TransformOneStringToAnother();

    @Test
    public void simpleTest(){
        Set<String> dictonary = new HashSet<>();
        dictonary.add("bat");
        dictonary.add("cot");
        dictonary.add("dog");
        dictonary.add("dag");
        dictonary.add("dot");
        dictonary.add("cat");

        int result = problem.transformString(dictonary,"cat","dag");
        System.out.println("Result " + result);
        assert result ==3;
    }
}
