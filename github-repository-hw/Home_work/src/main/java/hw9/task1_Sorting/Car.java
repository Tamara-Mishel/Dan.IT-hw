package hw9.task1_Sorting;

class Car {
    String name;
    int speed;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String toString() {
        return name + " - speed: " + speed;
    }
}
