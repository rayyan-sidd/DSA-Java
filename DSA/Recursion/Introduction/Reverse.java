package DSA.Recursion.Introduction;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(rev(1234));
    }
    static int rev(int n){
    //sometimes we might need more arguments in the recursive function, in that case we go for a helper function.

        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    
    static int helper(int n, int digits){
        if(n<10)
            return n;
    
        int rem = n%10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
}
