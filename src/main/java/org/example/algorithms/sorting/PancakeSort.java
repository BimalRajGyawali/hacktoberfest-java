package org.example.algorithms.sorting;

import java.util.Arrays;

public class PancakeSort {

    private static void flip (int[] arr, int size) {
        int prev, start = 0;

        while (start < size) {
            prev = arr[start];
            arr[start] = arr[size];
            arr[size] = prev;
            start++;
            size--;
        }
    }

    private static int getMax (int[] arr, int t) {
        int max = arr[0];
        int maxIndex = 0;
        
        for (int i = 1; i < t; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void pancakeSort (int[] arr) {
        for (int i = arr.length; i > 1; i--) {
            int maxIndex = getMax(arr, i);

            flip(arr, maxIndex);
            flip(arr, i-1);
        }
    }

    public static void main(String args []) {
        int[] arr = { 3, 4, 1, 2 };
        pancakeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
