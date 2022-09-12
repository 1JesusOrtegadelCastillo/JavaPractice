import arrays.RemoveDuplicatedFromSortedArray;
import org.testng.annotations.Test;



public class Testing {

    @Test
    void removeDuplicatedValues() {
        RemoveDuplicatedFromSortedArray removeDuplicates = new RemoveDuplicatedFromSortedArray();
        int[] nums = {1, 2, 2, 3, 4, 5}; // Input array
        int[] expectedNums = {1, 2, 3, 4, 5}; // The expected answer with correct length

        int k = removeDuplicates.removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
