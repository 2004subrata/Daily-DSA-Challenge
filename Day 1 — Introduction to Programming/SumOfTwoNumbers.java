// Sum of Two Numbers - Take two numbers as input and print their sum.

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Sum of " + a + " and " + b + " is : " + (a+b));
    }
}