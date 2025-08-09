package DSA.Recursion.Introduction;

public class SumOfDigits {
    public static void main(String[] args) {
        // int ans = sum(236);
        int ans1 = product(236);
        System.out.println(ans1);
    }

    static int sum(int n){
        if(n<10)
            return n;
        
        int rem = n%10;
        return rem + sum(n/10);
    }
    
    static int product(int n){
        if(n<10)
            return n;
        
        int rem = n%10;
        return rem * product(n/10);
    }

}
