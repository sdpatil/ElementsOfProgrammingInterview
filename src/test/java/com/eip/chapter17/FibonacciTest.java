package com.eip.chapter17;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 2/24/17.
 */
public class FibonacciTest {
    Fibonacci fibonacci;

    @Before
    public void setup(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void simpleTest(){
        for(int i = 0; i < 10; i++ ){
            System.out.print(fibonacci.fibonacci(i) +" ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++ ){
            System.out.print(fibonacci.fibonacciNonRecursive(i) +" ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++ ){
            System.out.print(fibonacci.fibonacciRecursive(i) +" ");
        }
    }
}
