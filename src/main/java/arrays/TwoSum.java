package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Expected time complexity O(n)
        Map<Integer, Integer> mapOfNumbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (mapOfNumbers.containsKey(complement)){
                return new int[]{mapOfNumbers.get(complement), i};
            } else {
                mapOfNumbers.put(nums[i], i);
                // System.out.println(mapOfNumbers);
            }
        }
        return new int[]{mapOfNumbers.get(target)};
    }

    // Time complexity: O(n*log(n))?
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
    public int[] findTwoSumReturnIntArray(int[] nums, int target) {
        int pointerStart = 0;
        int pointerEnd = nums.length - 1;

        while (pointerStart < pointerEnd){
            int sum = nums[pointerStart] + nums[pointerEnd];
            if (sum == target){
                return new int[]{pointerStart,pointerEnd};
            } else if (sum < target){
                pointerStart++;
            } else {
                pointerEnd--;
            }
        }
        return nums;
    }

    // Time complexity: O(n)?
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

