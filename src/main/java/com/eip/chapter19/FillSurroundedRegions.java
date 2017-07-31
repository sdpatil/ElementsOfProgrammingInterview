package com.eip.chapter19;

import java.util.*;

/**
 * Problem: Let A be 2D array whose entries are either W or B. Write a program that takes A and replaces
 * all Ws that cannot reach the boundary within B
 */
public class FillSurroundedRegions {
    public static class Coordinate{
        public Integer x,y;
        public Coordinate(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
    /*
        Explore all 4 boundaries and for every white space and starting from that space
        mark all the neghibors as visited
     */
    public void fillSurroundedRegions(List<List<Character>> board){
        if(board.isEmpty()) return;
        List<List<Boolean>> visited = new ArrayList<>(board.size());
        for(int i = 0 ; i < board.size() ;i++){
            visited.add(new ArrayList<>(Collections.nCopies(board.get(i).size(),false)));
        }
        for(int i = 0 ; i < board.size(); i++){        //Left most column
            if(!visited.get(i).get(0) && board.get(i).get(0) =='W')
                markBoundaryRegion(i,0,board,visited);
        }
        for(int i = 0 ; i < board.size(); i++){// Right most column
            int lastColumn = board.get(i).size()-1;
            if(!visited.get(i).get(lastColumn) && board.get(i).get(lastColumn) =='W')
                markBoundaryRegion(i,lastColumn,board,visited);
        }
        for(int i = 0 ; i < board.size() ;i++){ //First Row
            if(!visited.get(0).get(i) && board.get(0).get(i) =='W')
                markBoundaryRegion(0,i,board,visited);
        }
        for(int i = 0 ; i < board.size() ;i++){ //Last Row
            int lastRow = board.size()-1;
            if(!visited.get(lastRow).get(i) && board.get(lastRow).get(i) =='W')
                markBoundaryRegion(lastRow,i,board,visited);
        }
        // Whatever cell is not visited and is white change it to black
        for(int i =1 ; i < board.size() ;i++){
            for(int j = 0 ; j < board.get(i).size() ;j++){
                if(!visited.get(i).get(j) && board.get(i).get(j) == 'W')
                    board.get(i).set(j,'B');
            }
        }
    }

    /*
        Mark all the points on the board to black which are reachable from given point
     */
    public void markBoundaryRegion(int x, int y, List<List<Character>> board,List<List<Boolean>> visited ){
        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(x,y));
        int[][] DIRS = {{1,0},{0,1},{-1,0},{0,-1}};
        while (!q.isEmpty()){
            Coordinate c = q.poll();
            visited.get(c.x).set(c.y,true);
            for(int[] d: DIRS){
                Coordinate newCoordinate = new Coordinate(c.x+ d[0],c.y +d[1]);
                if(isFeasible(board,visited,newCoordinate))
                    q.add(newCoordinate);
            }
        }
    }
    public boolean isFeasible(List<List<Character>> board,List<List<Boolean>> visited, Coordinate cordinate){
        if(cordinate.x >=0 && cordinate.y >=0
                && cordinate.x < board.size()
                && cordinate.y < board.get(0).size()
                && board.get(cordinate.x).get(cordinate.y) =='W'
                && visited.get(cordinate.x).get(cordinate.y) ==false)
            return true;
        else
            return false;
    }
}
