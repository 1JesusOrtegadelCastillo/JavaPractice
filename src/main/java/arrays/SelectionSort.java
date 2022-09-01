package arrays;

/*
* The selection sort algorithm works by searching for the minimum element in an array
*  and placing it at the start of the said array. With each pass, we find the next
* smallest element and place it next. Eventually, we get an array with two sub-arrays.
* One sub-array is a sorted array that is at the beginning of the array.
* The other sub-array is an unsorted one.
*/

public class SelectionSort {

    public void sortArray(int[] arr){
        int small = -1; // at the beginning there is not a small number

        for (int i = 0; i < arr.length-1; i++){
            small = i;
            for (int j = i; j <= arr.length-1; j++){
                if (arr[j] < arr[small]){
                    small = j;
                }
                //swap values
            }
            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }

}
