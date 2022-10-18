package com.TrX;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length <= 0) {
            return;
        }

        int[] num = new int[m + n];
        int idx1 = 0;
        int idx2 = 0;
        int idx = 0;
        while (idx < m + n) {
            if (idx1 < m && idx2 < n && nums1[idx1] <= nums2[idx2]) {
                num[idx++] = nums1[idx1++];
            } else if (idx1 < m && idx2 < n && nums1[idx1] > nums2[idx2]) {
                num[idx++] = nums2[idx2++];
            } else if (idx1 == m && idx2 < n) {
                num[idx++] = nums2[idx2++];
            } else if (idx2 == n && idx1 < m) {
                num[idx++] = nums1[idx1++];
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = num[i];
        }
    }
