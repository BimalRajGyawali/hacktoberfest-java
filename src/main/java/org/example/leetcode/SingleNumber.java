package org.example.leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        int lone = 0;

        for(int i : nums){
            lone ^= i;
        }

        return lone;
    }

    public static void main(String ... args) {
        SingleNumber single = new SingleNumber();
        int nums[] = {2,2,1};
        String b = "aab";
        System.out.println(single.singleNumber(nums));
    }
}
