/* Author : G Pala Venki Reddy */

/* Topological Sort in Graphs in Java */

import java.io.*;
import java.util.*;
package org.example.algorithms;

public class TopologicalSort {

    static class Graph {
        int vertices;
        ArrayList<ArrayList<Integer> > adj;
        public Graph(int v) 
        {
            vertices = v;
            adj = new ArrayList<ArrayList<Integer> >(v);
            for (int i = 0; i < v; ++i)
                adj.add(new ArrayList<Integer>());
        }
        public void addEdge(int v, int w) 
        {
            adj.get(v).add(w);
        }

        public void topSortRecursive(int v, boolean visited[], Stack<Integer> stack) 
        {
            visited[v] = true;
            Integer i;
            Iterator<Integer> it = adj.get(v).iterator();
            while (it.hasNext()) {
                i = it.next();
                if (!visited[i])
                    topSortRecursive(i, visited, stack);
            }
            stack.push(new Integer(v));
        }
        public void topSort() 
        {
            Stack<Integer> stack = new Stack<Integer>();
            boolean visited[] = new boolean[vertices];
            for (int i = 0; i < vertices; i++) {
                visited[i] = false;
            }
            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    topSortRecursive(i, visited, stack);
                }
            }
            while (stack.empty() == false) {
                System.out.print(stack.pop() + " ");
            }
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        System.out.println("Following is a Topological Sort of the given graph");
        g.topSort();
    }
}