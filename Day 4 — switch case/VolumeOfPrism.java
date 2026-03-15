
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area of base : ");
        float b = sc.nextFloat();

        System.out.print("Enter height : ");
        int height = sc.nextInt();

        double volume = b * height;
        System.out.print("Volume of prism : " + volume);
    }
}
