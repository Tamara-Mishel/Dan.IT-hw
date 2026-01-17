package java_hw_4;

import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Enter word please: ");

        while (true) {
            String word = scanner.next();
            if (word.equals("STOP")) {
                break;
            }
            result = result + word + " ";
        }
        System.out.println(result);
    }
}
