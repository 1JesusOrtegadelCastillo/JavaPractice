package arrays;

/*
* Insertion sort is yet another simple sorting algorithm that we can use to sort an array.
*  In this algorithm, the given array is divided into two sub-arrays too. But unlike
* selection sort, the element is picked from the unsorted sub-array and is placed at its
*  correct position.
* */

public class InsertionSort {

    public void sortArray(int[] arr){

        int num = arr.length;

        for (int a = 1; a < num; a++){
            int keyValue = arr[a];
            int b = a - 1;

            while (b >= 0 && arr[b] > keyValue){
                arr[b + 1] = arr[b];
                b = b - 1;
                System.out.print(".." + b + "..");
            }

            arr[b + 1] = keyValue;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
