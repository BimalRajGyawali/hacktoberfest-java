package org.example.algorithms.backtracking;

import java.util.ArrayList;

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        solve(m,n,ans,"",visited,0,0);
        if(ans.size()==0){
            ans.add("-1");
        }
        return ans;
    }
    
    public static void solve(int[][] m, int n, ArrayList<String> ans, String output,boolean[][] visited,int i,int j){
        if(i<0 || i>=n || j<0 || j>=n || visited[i][j]==true || m[i][j]==0){
            return;
        }
        if(i==n-1 && j==n-1){
            ans.add(output);
            return;
        }
        visited[i][j] = true;
        
        solve(m,n,ans,output + 'D',visited,i+1,j);
        solve(m,n,ans,output + 'U',visited,i-1,j);
        solve(m,n,ans,output + 'R',visited,i,j+1);
        solve(m,n,ans,output + 'L',visited,i,j-1);
        
        visited[i][j]=false;
    }
}