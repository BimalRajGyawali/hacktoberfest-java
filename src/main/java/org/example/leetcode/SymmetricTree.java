package org.example.leetcode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {

        if(left == null || right == null) return (left == right);

        if( left.val != right.val) return false;

        return ( isSymmetric(left.left, right.right) &&  isSymmetric(left.right, right.left));

    }
}




 // Definition for a binary tree node.
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
