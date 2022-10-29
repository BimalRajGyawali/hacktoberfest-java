/*Given a reference of a node in a connected undirected graph.

Return a deep copy (clone) of the graph.

Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

class Node {
    public int val;
    public List<Node> neighbors;
} */

//Solution
package org.example.leetcode;

public class CloneGraph {
    public void dfs(Node node , Node copy , Node[] visited){
        visited[copy.val] = copy;
        for(Node n : node.neighbors){
            if(visited[n.val] == null){
                Node newNode = new Node(n.val);
                copy.neighbors.add(newNode);
                dfs(n , newNode , visited);
            }else{
                copy.neighbors.add(visited[n.val]);
            }
        }  
    }

    public Node cloneGraph(Node node) {
        if(node == null) return null; 
        Node copy = new Node(node.val);
        Node[] visited = new Node[101]; 
        Arrays.fill(visited , null);
        dfs(node , copy , visited); 
        return copy;
    }
}

