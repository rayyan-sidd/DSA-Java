package Searching.BinarySearch;

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {1, 22, 44, 55 , 66, 77, 88};
        int target = 45;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }

        }
        return arr[end];
    }
}
