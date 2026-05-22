package hw9.task4_BuilderPattern;

public class Car {

    String model;
    double price;
    int maxSpeed;
    int countOfWheels;

    public Car(String model, double price, int maxSpeed, int countOfWheels) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.countOfWheels = countOfWheels;
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
    public static class Builder {
        String model;
        double price;
        int maxSpeed;
        int countOfWheels;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }
        public Builder setPrice(double price) {

            this.price = price;

            return this;
        }
        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public Builder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }
        public Car build() {
            return new Car(model, price, maxSpeed, countOfWheels);
        }


    }
}