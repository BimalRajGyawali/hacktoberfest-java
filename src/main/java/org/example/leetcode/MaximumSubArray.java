package org.example.leetcode;
class MaximumSubArray
{
    public int maxSubArray(int[] nums)
    {
        int currSum = 0;
        int maxArrSum = nums[0];
        for (int num : nums)
        {
            if (currSum < 0)
            {
                // ignoring the negatrive integers because they do not contribute anything
                currSum = 0;
            }
            currSum += num;
            // finding the maximum between max we calculated and the max we will get upon adding the next number in the array
            maxArrSum = Math.max(maxArrSum, currSum);
        }
        return maxArrSum;
    }
}