package Searching.BinarySearch;
// Amazon

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 66, 77, 342, 777, 885, 8885};
        int target = 5;
        int ans = ansFinder(arr, target);
        System.out.println(ans);
    }

    static int ansFinder(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;

            end = end + (end - start + 1)*2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }
}
