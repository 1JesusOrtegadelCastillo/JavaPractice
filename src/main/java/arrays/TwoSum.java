package arrays;

public class TwoSum {

    public boolean twoSumAlgorithm(int[] input, int targetValue) {

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

}
