package java_hv_8.List_of_People.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String[] names = {"Toma", "Vlad", "Venia", "Toma"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String searchName = scanner.nextLine();

        int count = 0;

        for (String name : names) {
            if (name.equals(searchName)) {
                System.out.println("Found " + searchName);
                count++;
            }
        }

        System.out.println(searchName + " count: " + count);
    }
}