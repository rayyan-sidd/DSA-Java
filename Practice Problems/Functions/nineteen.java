//Circumference of the circle:

import java.util.*;

public class nineteen {

    public static double circum(double r){
        return 2*3.146*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference of the Circle is: " + circum(r));
        sc.close();
    }
}
