/*Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them. */


//Solution
package org.example.leetcode;

public class DiameterOfBinaryTree {
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
           
        int leftAns = height(root.left);
        int rightAns = height(root.right);
        int myAns = Math.max(leftAns, rightAns) + 1;
            
        return myAns;
            
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return -1;
        }
        int rootDia = height(root.left) + height(root.right) + 2;
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);
            
        int finalDia = Math.max(rootDia, Math.max(leftDia, rightDia));
        return finalDia;
            
    }
}
    

