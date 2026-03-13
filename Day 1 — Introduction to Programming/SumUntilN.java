//  Sum Until 'x' Keep taking numbers as input till the user enters x. After that, print the sum of all numbers entered.

import java.util.Scanner;

public class SumUntilN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1; i<=n ; i++){
            sum+=i;
        }

        System.out.print("Sum of all number until " + n + " is : " + sum);

    }
}
