//Kunal's approach: Efficient code and O(n), O(1)
import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int start = 0;
        int end = arr.length-1;

        while(end>start){
            swap(arr, start, end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int start, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }

}
