package Searching.LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        int[] nums = {11, 332, 44, 286, 11};
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            int digits = countDig(nums[i]);
            if(digits%2==0){
                counter++;
            }
        }
        System.out.println("Number of elements with even number of digits: "+counter);
    }
    static int countDig(int num){
        int digits = 0;
        while(num>0){
            digits++;
            num = num/10;
        }
        return digits;
    }
}

//Also i didn't check for the corner case where the number could be negative or zero. so my future self, do it when you read this.

// Important short trick to calculate digits:

// digits = (int)(Math.log10(num)) + 1; //log10 for decimal numbers, log8 for octal, log2 for binary.

