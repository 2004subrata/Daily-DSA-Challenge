// Take a name as input and print a greeting message for that name.

import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String s = sc.nextLine();
        System.out.print("Hello " + s + ", welcome to the Daily DSA Challenge!");
    }
}
