package CyclicSort;
//Amazon, Microsoft
//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    

    public static int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        return arr[arr.length - 1];
    }

    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
