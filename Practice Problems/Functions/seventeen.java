//sum of odd numbers from 1 to n:

import java.util.Scanner;
public class seventeen {

   public static int oddSum(int n)
   { int sum=0;
    for(int i=1; i<=n; i++){
        if(i%2 != 0){
            sum += i;
        }
        else continue;
    }
    return sum;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers: " + oddSum(n));
        sc.close();
    }
}
