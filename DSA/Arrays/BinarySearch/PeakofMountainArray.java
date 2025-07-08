package BinarySearch;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakofMountainArray {
    public static void main(String Args[]){
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        
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
        return start; //or end because start and end are equal at last
    }
}
