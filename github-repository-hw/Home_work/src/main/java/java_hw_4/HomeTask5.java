package java_hw_4;

import java.util.Random;
import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes, the number exists in the array.");
        } else {
            System.out.println("No, the number does not exist in the array.");
        }
        scanner.close();
    }
}