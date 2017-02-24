package com.eip.chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by sunilpatil on 2/23/17.
 */
public class ComputeAverageOfTopThreeScores {
    public static class StudentScore{
        public String name;
        public Integer score;

        public StudentScore(String name, Integer score) {
            this.name = name;
            this.score = score;
        }
    }
    public String findStudentWithHighestOfThreeScores(Iterator<StudentScore> nameScoreData){
        HashMap<String, PriorityQueue<Integer>> studentTop3Scores = new HashMap<String, PriorityQueue<Integer>>();
        while(nameScoreData.hasNext()){
            StudentScore studentScore = nameScoreData.next();
            String name = studentScore.name;
            int score = studentScore.score;
            PriorityQueue<Integer> scoreQueue = studentTop3Scores.get(name);
            if(scoreQueue == null){
                scoreQueue = new PriorityQueue<Integer>();
                studentTop3Scores.put(name, scoreQueue);
            }
            scoreQueue.add(score);
            while(scoreQueue.size() >3)
                scoreQueue.poll();
        }
        String studentName = null;
        int currentTopScore = Integer.MIN_VALUE;
        for(Map.Entry<String, PriorityQueue<Integer>> studentPriorityQueueEntry: studentTop3Scores.entrySet()){
            int studentScore = calculateTopScore(studentPriorityQueueEntry.getValue());
            if(studentScore > currentTopScore){
                studentName = studentPriorityQueueEntry.getKey();
                currentTopScore = studentScore;
            }
        }
        return studentName;
    }

    public int calculateTopScore(PriorityQueue<Integer> scoreQueue){
        if(scoreQueue.size() != 3)
            return -1;
        int totalScore = scoreQueue.poll() + scoreQueue.poll() + scoreQueue.poll();
        return totalScore/3;
    }
}
