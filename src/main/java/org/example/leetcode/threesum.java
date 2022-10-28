package org.example.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class threesum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,4}
        System.out.println(threesum(arr));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet();

        Set<Integer> duplicatedSet = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length - 2; i++) {
            if (!duplicatedSet.add(nums[i])) continue;

            for (int j = i + 1; j < nums.length; j++) {
                int value = 0 - nums[i] - nums[j];
                if (map.containsKey(value) && map.get(value) == i) {
                    List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], value));
                    Collections.sort(list);
                    resultSet.add(list);
                }
                map.put(nums[j], i);
            }
        }
        return new ArrayList<>(resultSet) ;
    }
}

