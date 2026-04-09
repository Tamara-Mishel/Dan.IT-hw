package java_hw_6_1.HomeTask2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Toyota";
        car.speed = 100;
        car.passengerCapacity = 5;

        car.move();
        car.stop();

        System.out.println();

        Truck truck = new Truck();
        truck.name = "FORD";
        truck.speed = 80;
        truck.loadCacacity = 12.5;

        truck.move();
        truck.stop();
    }
}
