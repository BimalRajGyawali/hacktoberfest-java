// Print all the nodes reachable from a given starting node in a digraph using BFS an DFS method
// code to demonstrate the BFS algorithm

package org.example.basics;

import java.io.*;
import java.util.*;

class BFS {
    private int V; // no of vertices in the graph
    private LinkedList<Integer>adj[]; // adjacency list

    BFS(int v) {
       V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }
    // function to add edges to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS_Find(int s) {

        // mark all the vetices as not visited
        boolean visited[] = new boolean[V];
        // create a queue for BFS

        LinkedList<Integer>queue = new LinkedList<Integer>();

        // mark the current vertex as visited and add it to the queue
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.pop(); // trying to get the first element from the linked list
            
            System.out.println(s + "" );

            // now get all the vertices adjacent to the current vertex, if some vertex is not visited then mark it as
            // visited and add it to the queue
            // Iterator & lt;
            Iterator<Integer>i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    } // end of BFS_Find()
    public static void main(String args[]) {
        BFS g = new BFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("The following is the BFS traversal of the graph G starting from the vertex 2 is:");
        g.BFS_Find(2);
    }
}
