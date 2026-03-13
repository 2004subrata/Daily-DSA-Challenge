// Take 2 numbers as input and print the largest.

import java.util.Scanner;
public class LargestAmongTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        if(num1 > num2) System.out.print(num1 + " is greater than " + num2);
        else if (num1 == num2) System.out.print("Both are equal");
        else System.out.print(num2 + " is greater than " + num1);
    }
}
