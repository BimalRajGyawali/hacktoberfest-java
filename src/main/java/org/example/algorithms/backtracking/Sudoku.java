package org.example.algorithms.backtracking;

import java.util.*;
public class Sudoku {
    public static boolean isSafe(char[][] board, int row,int col,int i) {
       for (int j = 0; j < board.length; j++) {
        if (board[j][col]==(char)(i+'0')) {
            return false;
        }
        if (board[row][j]==(char)(i+'0')) {
            return false;
        }
       }
       int sr =  row - (row%3);
       int sc = col - (col%3);

       for (int j = sr; j <sr+3; j++) {
        for (int j2 = sc; j2 < sc+3; (j2)++) {
            if (board[j][j2]==(char)(i+'0')) {
                return false;
            }
        }
       }

        return true;
    }
    public static boolean sudokuSolver(char[][] board,int row,int col) {
        if (row ==board.length) {
            return true;
        }
        int nrow =0;
        int ncol=0;
        if (col !=board.length-1) {
            nrow=row;
            ncol=col+1;
        }else{
            nrow=row+1;
            ncol =0;
        }
        if (board[row][col]!='.') {
            if(sudokuSolver(board, nrow, ncol)){
                return true;
            }
        }else{
            for (int i = 1; i <=9; i++) {
                if (isSafe(board,row,col,i)) {
                    board[row][col]=(char)(i+'0');
                    if(sudokuSolver(board, nrow, ncol)){
                       return true; 
                    }else{
                       board[row][col]='.'; 
                    }
                }
            }
        }return false;

    }
    public static void main(String[] args) {
        char[][] board =  {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}};
    if(sudokuSolver(board,0,0)){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }

    }
}
