package ex03_Part03;

import java.util.HashMap;
import java.util.Map;

public class Lab29_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 54};
        int target = 9;
        int[] result = twosum(nums, target);

        if (result != null) {
            System.out.println("Indices:[" + result[0] + "," + result[1] + "]");

        } else {
            System.out.println("No solution found.");
        }

    }

    private static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // In case there is no solution we just return null
        return null;

    }



}

