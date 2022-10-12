package org.example.algorithms.backtracking;
public class TilesProblem{
    public static int placeTiles(int n,int m) {
        if (n==m) {
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = placeTiles(n-m, m);
        int horizontal = placeTiles(n-1, m);
        return vertical+horizontal;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }
}
