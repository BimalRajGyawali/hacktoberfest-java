package org.example.algorithms.backtracking;

public class NQueen {
    public static boolean isSafe(int row, int col, char[][] ans) {
        // vertical
        for (int i = 0; i < ans.length; i++) {
            if (ans[i][col] == 'Q') {
                return false;
            }
        }
        // horizontal
        for (int i = 0; i < ans.length; i++) {
            if (ans[row][i] == 'Q') {
                return false;
            }
        }
        // upper left
        int i = row;
        for (int j = col; j >= 0 && i >= 0; j--, i--) {
            if (ans[i][j] == 'Q') {
                return false;
            }
        }
        // upper right
        i = row;
        for (int j = col; j < ans.length && i >= 0; j++, i--) {
            if (ans[i][j] == 'Q') {
                // System.out.println("eror");
                return false;
            }
        }
        // lower left
        i = row;
        for (int j = col; i < ans.length && j >= 0; i++, j--) {
            if (ans[i][j] == 'Q') {
                // System.out.println("eror");

                return false;
            }
        }
        // lower right
        i = row;
        for (int j = col; j < ans.length && i < ans.length; j++, i++) {
            if (ans[i][j] == 'Q') {
                // System.out.println("eror");
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                if (ans[i][j] == 'Q') {
                    System.out.print(ans[i][j] + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void placeQueen(char[][] ans, int col) {
        if (col >= ans.length) {
            printBoard(ans);
            return;
        }
        for (int row = 0; row < ans.length; row++) {
            if (isSafe(row, col, ans)) {
                ans[row][col] = 'Q';
                placeQueen(ans, col + 1);
                ans[row][col] = '_';
            }

        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] ans = new char[n][n];
        placeQueen(ans, 0);
    }
}
