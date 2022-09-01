package arrays;

public class BubbleSort {

    public void sortArrayOfIntegers(int[] arr){


         for (int i = 0; i < arr.length; i++){
             // Loop over java array outer loop use
             for (int j = i + 1; j < arr.length; j++){
                 //Loop over java Array
                 int tmp = 0;
                 if (arr[i] > arr[j]){
                     //Compare outer loop object with inner loop
                     tmp = arr[i]; //if greater then swap
                     arr[i] = arr[j]; //swapping
                     arr[j] = tmp;
                 }
             }
         }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
         }
    }

    //The outer loop is just for passing over the array while the inner loop swaps the adjacent
    // unordered elements in each pass. At the end of the last pass, we are left with the sorted array

}
