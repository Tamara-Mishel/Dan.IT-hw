package java_hw_4;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter warehouse capacity (kg): ");
        double remaining = scanner.nextDouble();

        while (remaining > 0) {
            System.out.print("Enter metal weight to change (kg): ");
            double weight = scanner.nextDouble();

            if (weight < 5) {
                System.out.println("Cannot accept: weight is too small (min 5 kg).");
                continue;
            }

            if (weight > remaining) {
                System.out.println("Cannot accept: not enough space. Remaining: " + remaining + " kg");
                continue;
            }

            remaining = remaining - weight;
            System.out.println("Accepted. Remaining space: " + remaining + " kg");
        }

        System.out.println("Warehouse is full. Program finished.");
        scanner.close();
    }
}

