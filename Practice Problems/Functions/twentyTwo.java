import java.util.Scanner;

public class twentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNeg, countPos, countZero;
        countNeg = countPos = countZero = 0;

        int i=1;
        while(i>0){
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            if (n>0) {
                countPos++;
            }else if(n<0)
            countNeg++;
            else
            countZero++;
            System.out.println("Type X if youre done: ");
            String x = sc.next();
            if(x == "X" || x == "x")
            break;
        }
        System.out.println(countPos + " Positive numbers entered");
        System.out.println(countNeg + " Negative numbers entered");
        System.out.println(countZero + " Zeroes numbers entered");
        sc.close();
    }
}
