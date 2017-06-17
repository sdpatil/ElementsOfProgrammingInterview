package com.eip.chapter19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class DeadlockDetectionTest {
    DeadlockDetection problem = new DeadlockDetection();

    @Test
    public void simpleTest(){
        List<DeadlockDetection.GraphVertex> graphVertexList = new ArrayList<>();
        DeadlockDetection.GraphVertex A = new DeadlockDetection.GraphVertex("A");
        DeadlockDetection.GraphVertex B = new DeadlockDetection.GraphVertex("B");
        DeadlockDetection.GraphVertex C = new DeadlockDetection.GraphVertex("C");
        DeadlockDetection.GraphVertex D = new DeadlockDetection.GraphVertex("D");
        A.edges.add(B);
        B.edges.add(C);
        C.edges.add(D);
        D.edges.add(A);
        assert problem.isDeadlocked(Arrays.asList(A,B,C,D));
    }

    @Test
    public void simple2Test(){
        List<DeadlockDetection.GraphVertex> graphVertexList = new ArrayList<>();
        DeadlockDetection.GraphVertex A = new DeadlockDetection.GraphVertex("A");
        DeadlockDetection.GraphVertex B = new DeadlockDetection.GraphVertex("B");
        DeadlockDetection.GraphVertex C = new DeadlockDetection.GraphVertex("C");
        DeadlockDetection.GraphVertex D = new DeadlockDetection.GraphVertex("D");
        A.edges.add(B);
        B.edges.add(C);
        C.edges.add(D);
        A.edges.add(D);
        assert !problem.isDeadlocked(Arrays.asList(A,B,C,D));
    }
}
