package hw9.task2_SingletonPattern;

public class Vehicle {

    String name;
    int speed;
    double price;
    String color;

    public Vehicle(String name, int speed, double price) {

        this.name = name;
        this.speed = speed;
        this.price = price;

        color = ColorSingleton.getInstance().getColor();
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name +
                "', speed=" + speed +
                ", price=" + price +
                ", color='" + color + "'}";
    }
}