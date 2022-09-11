import arrays.*;
import geometric.Triangle;
import sequence.PrintASequenceGivenNumber;

import java.lang.reflect.Array;
import java.util.Arrays;

import static arrays.TwoSum.findTwoSum;

public class Main {

    public static void main(String[] args){
    //new int[]{1,8,11,2,9,7,3,6}

        TwoSum ts = new TwoSum();
        System.out.println(Arrays.toString(findTwoSum(new int[]{1, 2, 3, 4}, 4)));
    }



}
