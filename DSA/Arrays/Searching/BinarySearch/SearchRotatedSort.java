package Searching.BinarySearch;
//Revise this as I haven't grasped the concept fully.
//google and amazon
//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchRotatedSort {
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int pivot = pivot(nums);

        if(nums[pivot] == target){
            System.out.println(pivot);
        }
        else if(pivot == -1){
            System.out.println( binarySearch(nums, target, 0, nums.length - 1));
        }
        else if(nums[0] <= target){
            System.out.println(binarySearch(nums, target, 0, pivot));
        }
        else{
            System.out.println(binarySearch(nums, target, pivot + 1, nums.length - 1));
        }
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid]> target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
//wont work for duplicate elements in the array.
    public  static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid]<nums[mid-1]){
                return mid - 1;   
            }
            if(nums[start] >= nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
