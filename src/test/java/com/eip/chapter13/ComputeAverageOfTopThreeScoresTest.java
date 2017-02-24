package com.eip.chapter13;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class ComputeAverageOfTopThreeScoresTest {
    ComputeAverageOfTopThreeScores computeAverageOfTopThreeScores;
    List<ComputeAverageOfTopThreeScores.StudentScore> studentScore = new ArrayList<ComputeAverageOfTopThreeScores.StudentScore>();

    @Before
    public void setup(){
        computeAverageOfTopThreeScores = new ComputeAverageOfTopThreeScores();
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",97));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",90));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",88));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",95));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",99));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Jiya",90));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Adam",91));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Adam",94));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Adam",97));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Adam",99));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Adam",93));
    }

    @Test
    public void simpleTest(){
        assert computeAverageOfTopThreeScores.findStudentWithHighestOfThreeScores(studentScore.iterator()).equals("Jiya");
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Navya",99));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Navya",99));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Navya",99));

        assert computeAverageOfTopThreeScores.findStudentWithHighestOfThreeScores(studentScore.iterator()).equals("Navya");
    }

    @Test
    public void lessThan3ScoresTest(){
        assert computeAverageOfTopThreeScores.findStudentWithHighestOfThreeScores(studentScore.iterator()).equals("Jiya");

        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Navya",99));
        studentScore.add(new ComputeAverageOfTopThreeScores.StudentScore("Navya",99));

        assert computeAverageOfTopThreeScores.findStudentWithHighestOfThreeScores(studentScore.iterator()).equals("Jiya");
    }
}
