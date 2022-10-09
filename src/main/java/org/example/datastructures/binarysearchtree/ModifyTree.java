package org.example.datastructures.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ModifyTree {
    class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeNode root;

    // 1. Insertion
    public void insert(int data) {
        root = insertRec(root, data);
    }

    public TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }
    int sum = 0;
    public void modify(TreeNode root)
    {
        if(root == null) return;

        modify(root.right);
        int temp = root.data;
        root.data = sum;
        sum += temp;
        modify(root.left);
    }
    public void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if(cur == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    System.out.println();
                    continue;
                }
            }
            System.out.print(cur.data+" ");
            if(cur.left != null) q.add(cur.left);
            if(cur.right != null) q.add(cur.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModifyTree obj = new ModifyTree();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n;i++)
            arr[i] = sc.nextInt();
        for(var i:arr)
            obj.insert(i);
        obj.modify(obj.root);
        obj.levelOrder(obj.root);
    }
}
