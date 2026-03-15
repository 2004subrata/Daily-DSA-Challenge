
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        float r = sc.nextFloat();

        double circumference = 2 * Math.PI * r;
        System.out.print("Circumference of the circle : " + circumference);
    }
}
