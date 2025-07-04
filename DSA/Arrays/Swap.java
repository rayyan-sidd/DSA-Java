import java.util.Arrays;

class Swap{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int index1, int index2){
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}