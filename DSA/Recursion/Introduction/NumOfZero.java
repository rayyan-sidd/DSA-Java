package DSA.Recursion.Introduction;

public class NumOfZero {
    public static void main(String[] args) {
        int n = 1020003;
        System.out.println(countZero(n)); //4
    }
    public static int countZero(int n){
        int count = 0;
        return helper(n, count);
    }

    static int helper(int n, int count){ //Debug to check the flow of this recursive call
        if(n == 0)
            return count;
        
        int rem = n%10;
        if(rem == 0)
            return helper(n/10, count+1);
        
        return helper(n/10, count);
    }
}
