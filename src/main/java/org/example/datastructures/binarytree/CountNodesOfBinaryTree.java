package org.example.datastructures.binarytree;
import java.util.*;

public class CountNodesOfBinaryTree {
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

    public static int inorder(Node root ) {
        int count =0;
            if (root == null) {
             return 0;
         }
        count=count+ inorder(root.left);
        
               count++;
           
       count=count+ inorder(root.right);
        return count;
     }
 public static int countNodes(Node root) {
     return inorder(root);
 }


    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree t = new Binarytree();
        Node root = t.buildtree(nodes);
        System.out.println( countNodes(root) );

    }
}
