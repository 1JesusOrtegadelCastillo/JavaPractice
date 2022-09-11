package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public boolean findTwoSumReturnBool(int[] input, int targetValue) {

        int pointerOne = 0;
        int pointerTwo = input.length -1;

        while (pointerOne < pointerTwo) {
            int sum = input[pointerOne] + input[pointerTwo];
            if (sum == targetValue){
                return true;
            } else if (sum < targetValue){
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }
        return false;
    }

    // Time complexity: O(n)
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{numMap.get(target)};
    }

}
