package org.example.leetcode
public class MajorityElement {
    public int majorityElement(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if (map.containsKey(i) && map.get(i)+1 > nums.length/2){
                return i;
            }else{
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }

        return -1;
    }
    public static void main(String... args){
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {3,2,3};
        System.out.println(majorityElement.majorityElement(nums));
    }

}