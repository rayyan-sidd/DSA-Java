package BinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/

//this ones a better approach than what i solved on leetcode.

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int peak = findPeak(arr);
        int target = 3;

        int ans = OrderAgnosticBS(arr, target, 0, peak);
        if(ans != -1){
            System.out.println(ans);
        }
        else{
            ans = OrderAgnosticBS(arr, target, peak+1, arr.length-1);
            System.out.println(ans);
        }
    }

    static int findPeak(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end){ 
        
        Boolean isAscending = arr[start] < arr[end];
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(isAscending){
            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            }
            else{
                if(target < arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            }
        }
        return -1;
    }
}
