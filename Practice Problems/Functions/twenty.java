//Eligibility check for voting:

import java.util.Scanner;

public class twenty {

    public static void ageCheck(int age)
    {
        if(age>=18)
        System.out.println("Eligible to Vote!");
        else
        System.out.println("Ineligible to Vote!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        ageCheck(age);
        sc.close();
    }
}
