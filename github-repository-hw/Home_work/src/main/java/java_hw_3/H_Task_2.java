package java_hw_3;
import java.util.Scanner;

public class H_Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side:");
        int a = scanner.nextInt();

        System.out.println("Enter second side:");
        int b = scanner.nextInt();

        System.out.println("Enter third side:");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle can be built");
        } else {
            System.out.println("Triangle cannot be built");
        }
    }
}