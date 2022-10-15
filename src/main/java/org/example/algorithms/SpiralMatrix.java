package org.example.algorithms;
import java.util.*;
public class SpiralMatrix {    
        static List<Integer> result = new ArrayList<>();        
        static List<Integer> spiralOrder(int matrix[][])
        {
            result.clear();
            rec(matrix);
            return result;    
        }
        
        static void rec(int matrix[][]){
            for(int j=0;j< matrix[0].length;j++)
                result.add(matrix[0][j]);
            if(matrix.length==1)
                return;
            matrix = getLowerTranspose(matrix);
            rec(matrix);
        }
    
        static int[][] getLowerTranspose(int matrix[][]){
            int ans[][] = new int[matrix.length-1][matrix[0].length];
            for(int i=1;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++)
                    ans[i-1][j] = matrix[i][j];
            }
            int[][] transpose = new int[ans[0].length][ans.length];
            for(int i = 0; i < ans.length; i++) {
                int l=0;
                for (int j = ans[0].length-1; j >= 0; j--) 
                    transpose[l++][i] = ans[i][j];
            }
            return transpose;
        }

    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
 
        System.out.println(spiralOrder(a));

    }  
    
}
