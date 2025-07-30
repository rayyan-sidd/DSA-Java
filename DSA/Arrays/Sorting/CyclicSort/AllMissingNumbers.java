package CyclicSort;

//GOOGLE
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = cycle(arr);
        System.out.println(ans);
        }

    static List<Integer> cycle(int[] arr){
        int i=0;
        List<Integer> missingNums = new ArrayList<>();
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                missingNums.add(j+1);
            }
        }
        return missingNums;
    }

    private static void swap(int[] arr, int i, int correctIndex) {
       int temp = arr[i];
       arr[i] = arr[correctIndex];
       arr[correctIndex] = temp;
    }
}
