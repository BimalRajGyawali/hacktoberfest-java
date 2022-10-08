/*
     Write a program to implement All-Pairs Shortest Paths problem using Floyd's algorithm. 
*/

import java.util.*;
public class FloydsClass
{
    static final int MAX = 20;
    static int n;                           //No. of vertices of G
    static int G[][] = new int[MAX][MAX];   //Adjacency matrix of G
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args)
    {
        readMatrix();
        floydsAlgorithm();
        printMatrix();
    }

    static void readMatrix()
    {
        System.out.println("Enter the number of vertices: ");
        n = sc.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                G[i][j] = sc.nextInt();
    }

    static void floydsAlgorithm()
    {
        for(int k=1; k<=n; k++)
            for(int i=1; i<=n; i++)
                for(int j=1; j<=n; j++)
                    if(G[i][j] > G[i][k] + G[k][j])
                        G[i][j] = G[i][k] + G[k][j];
    }

    static void printMatrix()
    {
        System.out.println("The shortest paths are: ");
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
                System.out.print(G[i][j] + " ");
            System.out.println();
        }
    }
}