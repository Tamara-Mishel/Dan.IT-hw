package java_hw_4;

import java.util.Scanner;

public class HomeTask4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 indexes (name, place, time): ");
        int nameIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();


        if (nameIndex < 0 || nameIndex >= names.length) {
            System.out.println("Wrong name index!");
        } else if (placeIndex < 0 || placeIndex >= places.length) {
            System.out.println("Wrong place index!");
        } else if (timeIndex < 0 || timeIndex >= times.length) {
            System.out.println("Wrong time index!");
        } else {
            System.out.println(names[nameIndex] + " буде йти до " + places[placeIndex] + " о " + times[timeIndex] + ":00");
        }

        scanner.close();
    }
}