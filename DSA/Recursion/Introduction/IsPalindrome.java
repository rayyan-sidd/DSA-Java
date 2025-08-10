package DSA.Recursion.Introduction;

public class IsPalindrome {
    public static void main(String[] args) {
        int n=1234321;
        System.out.println(palindrome(n));
    }

    static boolean palindrome(int n){
        return n == rev(n);
    }

    //copy-paste from Reverse.java
    static int rev(int n) {
        // sometimes we might need more arguments in the recursive function, in that
        // case we go for a helper function.

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n < 10)
            return n;

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }


}
