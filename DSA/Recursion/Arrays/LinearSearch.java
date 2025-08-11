package DSA.Recursion.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2, 5};
        System.out.println(search(arr, 2, 0));
        System.out.println(findFirstIndex(arr, 2, 0));
        findAllIndex(arr, 2, 0);
        System.out.println(list);
        System.out.println(findAllIndex2(arr, 2, 0, new ArrayList<>()));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length)
            return false;
        
        // else if(arr[index] == target)
        //     return true;

        return arr[index] == target || search(arr, target, index + 1);
    }

    static int findFirstIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return -1;

        if(arr[index] == target)
            return index;
        else   
            return findFirstIndex(arr, target, index + 1);
    }

    //For multiple ocurrences:

    //Method 1: Adding the multilpe indices to a list without returning it so we wont have to add it in the param.
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return;

        if(arr[index] == target)
            list.add(index);

        findAllIndex(arr, target, index+1);
    }

    //Method 2: No use of instance Arraylist, we'll pass it in the param with a return type

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target)
            list.add(index);

        return findAllIndex2(arr, target, index + 1, list);
    }
}



