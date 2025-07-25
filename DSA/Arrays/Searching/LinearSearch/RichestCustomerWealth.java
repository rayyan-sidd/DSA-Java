package Searching.LinearSearch;

//https://leetcode.com/problems/richest-customer-wealth/description/


public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,4,5}, {4,2,3}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int j = 0; j < account.length; j++) {
                wealth += account[j];
            }
            if(wealth>max){
                max = wealth;
            }
        }
        return max;
    }
}
