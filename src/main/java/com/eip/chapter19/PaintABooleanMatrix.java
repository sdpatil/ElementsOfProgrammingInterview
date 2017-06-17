package com.eip.chapter19;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/14/17.
 */
public class PaintABooleanMatrix {
    public static class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /*
        This function performs level order search, first get color of the start point and add start
        point to queue.
        Take out top most element from queue and

     */
    public void flipColors(List<List<Boolean>> matrix, int x, int y){
        int[][] nextNodes = {
                {1,0},{0,1},{-1,0},{0,-1}
        };

        boolean color = matrix.get(x).get(y);
        Queue<Coordinate> nextElementQueue = new LinkedList<>();
        nextElementQueue.add(new Coordinate(x,y));
        while (!nextElementQueue.isEmpty()){
            Coordinate coordinate = nextElementQueue.poll();
            matrix.get(coordinate.x).set(coordinate.y, !color);
            for(int[] next : nextNodes){
                Coordinate newCoordinate = new Coordinate(coordinate.x+ next[0], coordinate.y + next[1]);
                if(isFeasible(matrix,newCoordinate,color)){
                    nextElementQueue.add(newCoordinate);
                }
            }
        }
    }

    // This function checks if its feasible to go to the next point
    // First check if x and y are within the bounds.
    private boolean isFeasible(List<List<Boolean>> matrix, Coordinate newCoordinate, boolean color){
        if(newCoordinate.x >= 0 && newCoordinate.y >= 0
                && newCoordinate.x < matrix.size()
                && newCoordinate.y < matrix.get(0).size()
                && matrix.get(newCoordinate.x).get(newCoordinate.y) == color )
            return true;
        else
            return false;
    }
}
