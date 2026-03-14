
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();

        double area = Math.PI * r * r;
        System.out.print("Area of the circle is : " + area);
    }
}
