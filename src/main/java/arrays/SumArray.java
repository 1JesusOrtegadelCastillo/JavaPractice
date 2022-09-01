package arrays;

public class SumArray {

    public void sumArrayElements(int[] arr){
        int sum = 0;

        for (int i : arr)
            sum += i;
        System.out.println("Sum is: " + sum);
    }

}
