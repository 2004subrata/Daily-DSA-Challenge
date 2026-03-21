
import java.util.Scanner;

public class PalindromeOrNot {
    public static boolean isPalindrome(int n) {
        int start = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10; // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            n = n / 10; // remove last number
        }

        if (start == reversed)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        boolean isPalindrome = isPalindrome(n);
        if (isPalindrome)
            System.out.println(n + " is a Palindrome Number");
        else
            System.out.println(n + " is not a Palindrome Number");
    }

}
