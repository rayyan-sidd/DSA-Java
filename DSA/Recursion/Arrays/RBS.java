package DSA.Recursion.Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        System.out.println(search(arr, 7, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e){
        int m = s + (e - s) / 2;
        if(s>e){
            return -1;
        }

        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return search(arr, target, s, m);    
            }
            else{
                return search(arr, target, m+1, e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m);
    }
}
