package com.eip.chapter9;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/15/17.
 */
public class EvaluateRPNExpressionTest {
    EvaluateRPNExpression evaluateRPNExpression;

    @Before
    public void setup(){
        evaluateRPNExpression = new EvaluateRPNExpression();
    }

    @Test
    public void singleNumberTest(){
        assert evaluateRPNExpression.eval("6") ==6;
        assert evaluateRPNExpression.eval("123") ==123;
        assert evaluateRPNExpression.eval("-42") ==-42;
    }

    @Test
    public void arithmaticExpressionTest(){
        assert evaluateRPNExpression.eval("3,4,+,2,*,1,+") ==15;
        assert evaluateRPNExpression.eval("1,1,+,-2,*") ==-4;
        assert evaluateRPNExpression.eval("-641,6,/,28,/") ==-3;

    }
}
