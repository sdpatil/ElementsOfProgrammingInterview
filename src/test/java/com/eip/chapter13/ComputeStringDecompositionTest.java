package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class ComputeStringDecompositionTest {
    ComputeStringDecomposition computeStringDecomposition;

    @Before
    public void setup(){
        computeStringDecomposition = new ComputeStringDecomposition();
    }

    @Test
    public void simpleTest(){
        List<String> wordList = Arrays.asList("can","apl","ana");
        List<Integer> result = computeStringDecomposition.findAllSubStrings("amanaplanacanal",wordList);
        assert result.size() ==1;
        assert result.get(0) ==4;
    }
}
