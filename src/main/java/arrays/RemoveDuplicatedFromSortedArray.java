package arrays;

public class RemoveDuplicatedFromSortedArray {
    public int removeDuplicates(int[] nums)
    {
        int indexItr = 1, k = 0;

        while(indexItr < nums.length && k < nums.length)
        {
            if(nums[k] != nums[indexItr])
            {
                nums[++k] = nums[indexItr];
            }
            indexItr++;
        }

        return k+1;
    }
}
