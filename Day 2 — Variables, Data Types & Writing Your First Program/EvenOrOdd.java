// Write a program to print whether a number is even or odd — take input from the user.

import java.util.Scanner;
public class EvenOrOdd {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.print(n + " is Even");
        } else System.out.print(n + " is Odd");
    }
}