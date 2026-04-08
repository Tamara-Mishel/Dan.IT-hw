package java_hw_3;

import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Enter operation (+, -, *):");
        String operation = scanner.next();

        int result =
                operation.equals("+") ? a + b :
                        operation.equals("-") ? a - b :
                                operation.equals("*") ? a * b :
                                        0;

        System.out.println(result);
    }
}

