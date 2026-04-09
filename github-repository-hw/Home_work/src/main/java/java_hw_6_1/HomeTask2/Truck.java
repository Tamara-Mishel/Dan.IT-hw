package java_hw_6_1.HomeTask2;

public class Truck extends Vehicle {
    double loadCacacity;

    @Override
    public void move() {
        System.out.println("The vehicle " + name +
                " with load capacity " +
                " tons is moving at speed " + speed +
                " km/h");
    }

}
