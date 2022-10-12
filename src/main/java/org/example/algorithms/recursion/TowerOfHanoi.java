package org.example.algorithms.recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);//1st step
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);//2nd step
        towerOfHanoi(n - 1, helper, src, dest);//3rd step
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
