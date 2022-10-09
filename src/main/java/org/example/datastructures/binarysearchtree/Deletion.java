package org.example.datastructures.binarysearchtree;

import java.util.Scanner;

public class Deletion {
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

    // 2. Traversal
    public void preOrder(TreeNode node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    // 3. Deletion
    public TreeNode delete(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    public static int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deletion obj = new Deletion();
        int x;
        while (true) {
            System.out.print("Enter element : ");
            x = sc.nextInt();
            if (x == -1) break;
            obj.insert(x);
        }
        System.out.print("\nPreOrder -> ");
        obj.preOrder(obj.root);
        System.out.print("\nInOrder -> ");
        obj.inOrder(obj.root);
        System.out.print("\nPostOrder -> ");
        obj.postOrder(obj.root);
        System.out.println();
        // Deletion
        System.out.print("Enter element to delete : ");
        int key = sc.nextInt();
        obj.root = obj.delete(obj.root, key);

        System.out.print("\nPreOrder -> ");
        obj.preOrder(obj.root);
        System.out.print("\nInOrder -> ");
        obj.inOrder(obj.root);
        System.out.print("\nPostOrder -> ");
        obj.postOrder(obj.root);
    }
}
