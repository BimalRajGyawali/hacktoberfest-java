/*
     Write a program to implement Dijkstra's Algorithm. 
*/

import java.util.*;

public class DijkstraClass{
    final static int MAX = 20;
    final static int infinity = 9999;
    static int n;                           //No. of vertices of G
    static int G[][] = new int[MAX][MAX];   //Adjacency matrix of G
    static Scanner sc = new Scanner(System.in);

    public static void main(String [] args)
    {
        ReadMatrix();
        int source = 0;              //source vertex
        System.out.println("Enter the source vertex: ");
        source = sc.nextInt();
        Dijkstra(s);
    }

    static void ReadMatrix()
    {
        System.out.println("Enter the number of vertices: ");
        n = sc.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                G[i][j] = sc.nextInt();
    }

    static void Dijkstra(int source)
    {
        int S[] = new int[MAX];     //Set of vertices whose shortest path from source is found
        int dist[] = new int[MAX];     //Distance of vertices from source

        int u,v;
        int i;
        for(i = 0; i<n; i++)
        {
            S[i] = 0;               //Initially no vertex is included in S
            dist[i] = G[source][i]; //Distance of vertices from source
        }
        S[source] = 1;              //Source vertex is included in S
        dist[source] = 0;           //Distance of source vertex from itself is 0

        i = 2;
        while(i<=n)
        {
            int min = infinity;
            for(int w=0; w<n; w++)
            {
                if(S[w] == 0 && dist[w] < min)
                {
                    min = dist[w];
                    u = w;
                }
            }
            S[u] = 1;
            i++;
            for(v=0; v<n; v++)
            {
                if(S[v] == 0 && G[u][v] != infinity && dist[u] + G[u][v] < dist[v])
                    dist[v] = dist[u] + G[u][v];
            }
        }
        for(i=0;i<n;i++)
            if(i!=s)
            System.out.println(i+":"+d[i]);
    }
}
