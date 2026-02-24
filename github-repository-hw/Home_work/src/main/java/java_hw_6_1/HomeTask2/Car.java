package java_hw_6_1.HomeTask2;

public class Car extends Vehicle {
    int passengerCapacity;
    @Override
    public void move() {
        System.out.println("The vehicle " + name +
                " is moving at speed " + speed +
                "km/h with " + passengerCapacity +
                " passengers");
    }
}
