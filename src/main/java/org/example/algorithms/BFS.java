/* BFS algorithm in Java
contributed by @whyanujjwhy

The algorithm works as follows:

->Start by putting any one of the graph's vertices at the back of a queue.
->Take the front item of the queue and add it to the visited list.
->Create a list of that vertex's adjacent nodes. Add the ones which aren't in the visited list to the back of the queue.
->Keep repeating steps 2 and 3 until the queue is empty.
 */

import java.util.*;

public class Graph {
  int V;
  LinkedList<Integer> adj[]; //LL to store adjacent vertices of current node

  //creating directed graph
  Graph(int v) {
    V = v;
    adj = new LinkedList[v];

    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  // Add edges to the graph
  void addEdge(int v, int w) {
    adj[v].add(w);
  }

  // BFS algo
  void BFS(int s) {

    boolean visited[] = new boolean[V];

    LinkedList<Integer> queue = new LinkedList();

    visited[s] = true;
    queue.add(s);

    while (queue.size() != 0) {
      s = queue.poll();
      System.out.print(s + " ");

      Iterator<Integer> i = adj[s].listIterator();

      while (i.hasNext()) {
        int n = i.next();
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    
    System.out.println("Following is Breadth First Traversal " + "(starting from vertex 1)");

    g.BFS(1);
  }
}
