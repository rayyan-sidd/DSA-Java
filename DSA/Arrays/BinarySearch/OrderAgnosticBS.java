package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 44, 55, 66, 777, 999};
        int target = 777;
        int ans = OABinarySearch(arr, target);
        System.out.println(ans);
    }
    
    static int OABinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;    
        
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
