package Searching.BinarySearch;
// Facebook
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

import java.util.Arrays;

public class FirstAndLastPosOfElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1, -1}; 
        
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }

        System.out.println(Arrays.toString(ans));
        
    }

    public static int search(int[] nums, int target, Boolean ifStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid; //ans is stored but theres a possibility for the same number to be on the right side(first index)
                if(ifStartIndex){ 
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
