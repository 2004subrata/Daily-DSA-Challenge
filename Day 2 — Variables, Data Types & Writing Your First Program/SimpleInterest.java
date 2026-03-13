// Input Principal (P), Time (T), Rate (R) from the user and calculate Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (p) : ");
        int p = sc.nextInt();

        System.out.print("Enter Time (T) : ");
        float t = sc.nextFloat();

        System.out.print("Enter Rate (R) : ");
        float r = sc.nextFloat();

        float si = (p*t*r)/100;
        System.out.print("Your Simple Interest is : " + si);
    }
}
