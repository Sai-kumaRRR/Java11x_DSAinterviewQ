package ex07_Leetcode_practicesession;

import static jdk.internal.util.OperatingSystem.current;

public class Lab47_maxiumSubarray {
    public int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int currentSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

}
