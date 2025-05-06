package ex07_Leetcode_practicesession;

import java.util.HashMap;
import java.util.Map;

public class Lab37_leetcode01 {
    public static void main(String[] args) {
        // two sum
        int[] twoSum;
        int[] num; int target = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int nums;
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        twoSum new IllegalArgumentException("No sum solution");
    }
}
