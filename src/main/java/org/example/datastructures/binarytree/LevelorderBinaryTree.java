package org.example.datastructures.binarytree;
import java.util.*;

public class LevelorderBinaryTree {
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

      //level order
        private static void levelorder( Node root) {
            if (root ==null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curNode =q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                } else {
                    System.out.print(curNode.data +" ");
                    if (curNode.left !=null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right !=null) {
                        q.add(curNode.right);
                    }
                }
            }
        }


    }
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree t = new Binarytree();
        Node root = t.buildtree(nodes);
        // System.out.println(root.data);
        t.levelorder(root);

      
    }
}
