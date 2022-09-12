import arrays.*;
import geometric.Triangle;
import other.*;
import sequence.PrintASequenceGivenNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

import static arrays.TwoSum.findTwoSum;

public class Main {

    public static void main(String[] args){
    //new int[]{1,8,11,2,9,7,3,6}

        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(findTwoSum(new int[]{1, 2, 3, 4}, 4)));

        int[] nums = {1,2,3,4,5};
        int target = 8;
        int[] excercise = findTwoSum(nums,target);
        System.out.println(Arrays.toString(excercise));

        TwoSumEx tse = new TwoSumEx();
        System.out.println(Arrays.toString(tse.twoSum(new int[]{1,5,10,15,20,25},35)));

        System.out.println(Arrays.toString(ts.twoSum(new int[]{1,2,3,4,5,6,7,8}, 11)));

        NumberPalindrome np = new NumberPalindrome();
        System.out.println(np.isPalindrome(121));

        System.out.println("------");
        Anagrams an = new Anagrams();
        System.out.println(an.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println("------");
        AnagramTest ant = new AnagramTest();
        System.out.println(ant.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));

        SumArray sa = new SumArray();

        System.out.println("-------------------------");
        LongestSubstring lgs = new LongestSubstring();
        System.out.println(lgs.lengthOfLongestSubstring("bbbbb"));
        System.out.println("-----------------");
        RemoveElement re = new RemoveElement();
        System.out.println(re.removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        System.out.println("-----------------");
        RemoveDuplicatedFromSortedArray remd = new RemoveDuplicatedFromSortedArray();
        System.out.println(remd.removeDuplicates(new int[]{1,2,3,4,4}));


    }



}
