package org.example.leetcode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int index = 1;

        for(int i =0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                nums[index++]=nums[i+1];
            }
        }

        return index;
    }

    public static void main(String... args){
        RemoveDuplicates duplicates = new RemoveDuplicates();
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicates.removeDuplicates(array));
    }
}
