package BubbleSort;

import java.util.Arrays;

public class BubSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 5};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] arr){
        boolean sorted;

        for(int i=0; i < arr.length; i++){
            sorted = false;
            for(int j=1; j< arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            } //this will check for every pass if there was a swap. If yes, move ahead and if not, then just break the loop.            break;
        }
    }
}
