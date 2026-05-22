package hw9.task1_Sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW", 220));
        cars.add(new Car("Toyota", 180));
        cars.add(new Car("Audi", 240));
        cars.add(new Car("Honda", 170));
        cars.add(new Car("Mercedes", 230));

        System.out.println("Before sorting:");
        for (Car car : cars) {
            System.out.println(car);
        }

        cars.sort(Comparator.comparingInt(car -> car.speed));

        System.out.println("\nAfter sorting by speed:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}