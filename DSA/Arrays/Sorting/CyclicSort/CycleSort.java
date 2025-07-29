package CyclicSort;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr= {5, 2, 4, 1, 3};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    
    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1; //correct index of the element(arr[i])
            if(arr[i] != arr[correct]){ //arr[i] should be equal to arr[correct] to ensure the element is at correct index.
            swap(arr, i, correct);
            }
            else{
            i++;
        }
        }
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

//WRONG APPROACH THAT I WROTE:

// static void cycle(int[] arr){
//     int i=0;
//     int len = arr.length;

//     while(i<len){
//         if(arr[i] == i+1){
//             i++;
//         }
//         else{
//             int temp = arr[i];
//             arr[i] = arr[i+1];
//             arr[i+1] = temp;
//         }
//     }
// }