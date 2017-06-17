package com.eip.chapter19;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by sunilpatil on 5/3/17.
 */
public class SearchMaze {

    public static class Coordinate{
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coordinate that = (Coordinate) o;
            if (x != that.x) return false;
            return y == that.y;
        }
        @Override
        public int hashCode() {
            return Objects.hash(x,y);
        }
        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static enum Color{WHITE,BLACK}
    public List<Coordinate> searchMaze(List<List<Color>> maze, Coordinate s, Coordinate e){
        List<Coordinate> path = new ArrayList<>();
        // set the first point to black, add it to path and start exploring
        maze.get(s.x).set(s.y, Color.BLACK);
        path.add(s);
        if(!searchMazeHelper(maze,s,e,path))
            path.remove(path.size()-1);
        return path;
    }

    // Recursive function that checks if we can explore the maze if current is the start point and e is the end
    public boolean searchMazeHelper(List<List<Color>> maze, Coordinate current, Coordinate e,
                                    List<Coordinate> path){
        if(current.equals(e))
            return true;
        //These are the four directions you can go
        int[][] SHIFT ={
                {0,1},{1,0},{0,-1},{-1,0}
        };
        //For current point try all four directions
        for(int[] s: SHIFT){
            Coordinate next = new Coordinate(current.x + s[0], current.y+s[1]);
            if(isFeasible(next,maze)) {
                //If moving to the next point is feasible, turn that point black and add it to path
                maze.get(next.x).set(next.y,Color.BLACK);
                path.add(next);
                //Try moving to next point
                if(searchMazeHelper(maze, next, e, path))
                    return true;
                path.remove(path.size()-1);
            }
        }
        return false;
    }

    // Use this function to check if moving to supplied coordinate is feasible.
    // First check if x and y are within the boundaries and then check if current point is white
    public boolean isFeasible(Coordinate current, List<List<Color>> maze){
        if(current.x >=0 && current.y >= 0 && current.x < maze.size() && current.y < maze.get(0).size() &&
                maze.get(current.x).get(current.y) == Color.WHITE)
            return true;
        else
            return false;
    }
}
