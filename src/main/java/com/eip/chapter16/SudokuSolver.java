package com.eip.chapter16;

import java.util.List;

/**
 * Created by sunilpatil on 4/2/17.
 */
public class SudokuSolver {

  /*  private static final int EMPTY_ENTRY = 0;

    public boolean solveSudoku(List<List<Integer>> partialAssignment){
        return solvePartialSudoku(partialAssignment,0,0);
    }

    public boolean solvePartialSudoku(List<List<Integer>> partialAssignment, int i, int j){
        if(i == partialAssignment.size()){
          i =0;
        }
        return false;
    }

    public boolean validAddToVal(List<List<Integer>> partialAssignment){
        return false;
    }*/

  public void  solve(int[][] board){
      int[][] status = new int[board.length][board[0].length];
      for(int i = 0; i < board.length; i++){
          for(int j = 0; j < board[0].length; j++){
              status[i][j] = board[i][j] >0?2:0;
          }
      }
      solve(board,status,0,0);
  }

  public boolean solve(int[][] board, int[][] status, int x, int y){
    if(x == 9){
        int count =0 ;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
               if(board[i][j] > 0){
                   count = count+1;
               }
            }
        }
        if(count ==81)
            return true;
        else
            return false;

    }
    if(status[x][y] >=1){
        int nextX = x;
        int nextY = y+1;
        if(nextY ==9){
            nextX = x+1;
            nextY =0;
        }
        return solve(board,status,nextX,nextY);
    }else{
        boolean[] used = new boolean[9];
        for(int i = 0 ; i < 9 ; i++){
            if(status[x][i] >=1){
                used[board[x][i]-1] = true;
            }
        }

        for(int i = 0 ; i < 9 ; i++){
            if(status[i][y] >=1){
                used[board[i][y]-1] = true;
            }
        }
        for(int i = x-(x%3) ; i < x- (x%3) +3;i++){
            for(int j = y - (y%3); j < y - (y%3) +3;j++){
                if(status[i][j] >= 1)
                    used[board[i][j]-1] = true;

            }
        }
        for(int i = 0; i < used.length;i++){
            if(!used[i]){
                status[x][y] =1;
                board[x][y] = i+1;
                int nextX = x;
                int nextY = y+1;

                if(nextY == 9){
                    nextX = x+1;
                    nextY = 0;

                }
                if(solve(board,status,nextX,nextY))
                    return true;

                for(int m = 0; m < 9; m++){
                    for(int n = 0; n < 9; n++){
                        if(m >x || (m ==x && n >=y)){
                            if(status[m][n] ==1){
                                status[m][n] =0;
                                board[m][n] =0;
                            }
                        }
                    }
                }
            }
        }
    }
    return false;
  }
}
