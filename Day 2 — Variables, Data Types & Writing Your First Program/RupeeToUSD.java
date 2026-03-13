// Input an amount in Indian Rupees and convert it to USD. (Use: 1 USD = 83.5 INR — update with current rate)

import java.util.Scanner;
public class RupeeToUSD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rupees : ");
        int rupees = sc.nextInt();

        double usd = rupees/83.5;
        System.out.print(rupees +" rupees = " + usd + " USD");
    }
}
