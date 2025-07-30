package CyclicSort;

import java.util.ArrayList;
import java.util.List;

//
//https://leetcode.com/problems/find-all-duplicates-in-an-array
public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
        
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }
        
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index + 1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
