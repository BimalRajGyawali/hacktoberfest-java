package org.example.datastructures.binarytree;

import java.util.*;

public class ReverseLevelorderBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytree {
        static int idx = -1;

        public Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }

        
    public static ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> li = new ArrayList<Integer>();
        // code here
        if (node==null){
            return li;   
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            Node currNode =q.remove();
            li.add(currNode.data);
             if (currNode.right !=null) {
                        q.add(currNode.right);
                    }
            if (currNode.left !=null) {
                        q.add(currNode.left);
                    }
        }
          Collections.reverse(li);
          return li;
    }

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Binarytree t = new Binarytree();
        Node root = t.buildtree(nodes);
        System.out.println(t.reverseLevelOrder(root));
    }
}
