package hw9.task4_BuilderPattern;

public class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .setModel("BMW")
                .setPrice(33980)
                .setMaxSpeed(220)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}
