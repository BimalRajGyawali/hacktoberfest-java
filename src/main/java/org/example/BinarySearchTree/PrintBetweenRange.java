package org.example.BinarySearchTree;

import java.util.Scanner;

public class PrintBetweenRange {
    class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }
    public TreeNode insertRec(TreeNode root, int data) {
        if(data == -1) return root;
        if (root == null) {
            root = new TreeNode(data);
            return root;
        } else if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }
    public void PrintRange(TreeNode root,int n1,int n2)
    {
        if(root == null) return;
        if(root.data >= n1 && root.data <= n2) System.out.println(root.data + " ");
        PrintRange(root.right,n1,n2);
        PrintRange(root.left,n1,n2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintBetweenRange obj = new PrintBetweenRange();
        int x;
        do{
            System.out.print("Enter data : ");
            x = sc.nextInt();
            obj.insert(x);
        }while(x!=-1);
        System.out.print("Enter n1 and n2 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        obj.PrintRange(obj.root,n1,n2);
    }
}
