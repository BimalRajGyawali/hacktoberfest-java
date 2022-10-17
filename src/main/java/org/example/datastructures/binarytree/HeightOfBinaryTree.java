package org.example.datastructures.binarytree;
import java.util.*;

public class HeightOfBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Binarytree{
        static int idx =-1;
        public Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx]==-1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left= buildtree(nodes);
            newnode.right =buildtree(nodes);
            return newnode;
        }

    }
    
        //height of binary tree
        public static int maxDepth(Node root) {
        
            if(root== null){
                return 0;
            }
            int x = maxDepth(root.left);
            int y = maxDepth(root.right);
            int z = Math.max(x,y) +1;
            return z;
    
        }
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree t = new Binarytree();
        Node root = t.buildtree(nodes);
        System.out.println( maxDepth(root) );
      
    }
}
