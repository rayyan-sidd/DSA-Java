package InsertionSort;

import java.util.Arrays;

public class InSort {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4,2, -1, 100};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
