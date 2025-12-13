package java_hw_3;

import java.util.Scanner;

public class H_TASK_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        int result = (a > b) ? (a - b) : (b - a);

        System.out.println("Result: " + result);
    }
}
