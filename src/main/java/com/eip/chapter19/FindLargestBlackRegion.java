package com.eip.chapter19;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class FindLargestBlackRegion {
    public static class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int findLargestBlackRegion(List<List<Boolean>> matrix){
        int maxRegion = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[matrix.size()][matrix.get(0).size()];
        for(int i = 0 ; i < matrix.size(); i++){
            for(int j = 0; j < matrix.get(i).size(); j++){
                if(matrix.get(i).get(j) == false){
                    int regionSize = findLargestBlackRegionStartingAtPoint(matrix,i,j,visited);
                    maxRegion = Math.max(regionSize,maxRegion);
                }
            }
        }
        return maxRegion;
    }

    public int findLargestBlackRegionStartingAtPoint(List<List<Boolean>> matrix, int x, int y, boolean[][] visited){
        int count = 0;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x,y));
        int[][] DIR = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty()){
            Coordinate coordinate = queue.poll();
            visited[coordinate.x][coordinate.y] = true;
            count = count+1;
            for(int[] dir: DIR){
                Coordinate nextCoordindate = new Coordinate(coordinate.x+dir[0], coordinate.y+ dir[1]);
                if(isFeasible(matrix,nextCoordindate) && visited[nextCoordindate.x][nextCoordindate.y] == false){
                    queue.add(nextCoordindate);
                }
            }
        }
        return count;
    }
    public boolean isFeasible(List<List<Boolean>> matrix, Coordinate coordinate){
        if(coordinate.x >=0 && coordinate.y >=0
                && coordinate.x < matrix.size()
                && coordinate.y < matrix.get(0).size()
                && matrix.get(coordinate.x).get(coordinate.y) == false) // Check if the value of matrix is false, that means black color
            return true;
        else
            return false;
    }
}
