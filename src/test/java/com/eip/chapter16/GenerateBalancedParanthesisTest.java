package com.eip.chapter16;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class GenerateBalancedParanthesisTest {
    GenerateBalancedParanthesis generateBalancedParanthesis;

    @Before
    public void setup(){
        generateBalancedParanthesis = new GenerateBalancedParanthesis();
    }

    @Test
    public void simple2Test(){
        List<String> parenthesisList = generateBalancedParanthesis.generateBalancedParanthesis(2);
        System.out.println(parenthesisList);
        assert parenthesisList.size() == 2;
    }

    @Test
    public void simple3Test(){
       List<String> parenthesisList = generateBalancedParanthesis.generateBalancedParanthesis(3);
       System.out.println(parenthesisList);
       assert parenthesisList.size() == 5;
    }

}
