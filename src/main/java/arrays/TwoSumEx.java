package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumEx {
    public int[] twoSum(int[] nums, int target) {
        // Expected time complexity O(n)
        Map<Integer, Integer> mapOfNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (mapOfNums.containsKey(complement)){
                return new int[]{mapOfNums.get(complement), i};
            } else {
                mapOfNums.put(nums[i], i);
            }
        }
        return new int[]{mapOfNums.get(target)};
    }
}
