package SelectionSort;

import java.util.Arrays;

public class SelSort {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0; i < arr.length; i++){
// find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int max = getMax(arr, last);

            swap(arr, max, last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }

    private static int getMax(int[] arr, int last) {
       int max = 0;
       for(int i = 0; i<=last; i++){
        if(arr[max]<arr[i]){
            max = i;
        }
       }
       return max;
    }
}
