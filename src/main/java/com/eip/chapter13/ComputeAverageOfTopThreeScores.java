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
    /*
        Problem: Given a file containing student name and scores on each line, find out which student got highest
        marks in his top 3 subject
        Solution: - First create a map of student name to prirority queue. In the priority queue maintain his top 3
        scores. Then iterate through the map calculating sum of each student's score, use that to find out the
         student with max score
     */
    public String findStudentWithHighestOfThreeScores(Iterator<StudentScore> nameScoreData) {
        Map<String, PriorityQueue<Integer>> nameToTop3ScoresMap = new HashMap<>();
        // Build a HashMap of student name to his top 3 score priority queue
        while (nameScoreData.hasNext()){
            StudentScore currentStudent = nameScoreData.next();
            if(!nameToTop3ScoresMap.containsKey(currentStudent.name)){
                PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
                priorityQueue.add(currentStudent.score);
                nameToTop3ScoresMap.put(currentStudent.name,priorityQueue);
            }else{
                PriorityQueue<Integer> priorityQueue = nameToTop3ScoresMap.get(currentStudent.name);
                priorityQueue.add(currentStudent.score);
                if(priorityQueue.size() > 3){
                    priorityQueue.poll();
                }
            }
        }
        String result = null;
        int currentTopScore = Integer.MIN_VALUE;
        for(Map.Entry<String, PriorityQueue<Integer>> entry: nameToTop3ScoresMap.entrySet()){
            String studentName = entry.getKey();
            int studentScore = calculateTopScore(entry.getValue());
            if(studentScore > currentTopScore){
                currentTopScore = studentScore;
                result = studentName;
            }
        }
        return result;
    }
    public int calculateTopScore(PriorityQueue<Integer> scoreQueue){
        if(scoreQueue.size() != 3)
            return -1;
        int totalScore = scoreQueue.poll() + scoreQueue.poll() + scoreQueue.poll();
        return totalScore/3;
    }

}
