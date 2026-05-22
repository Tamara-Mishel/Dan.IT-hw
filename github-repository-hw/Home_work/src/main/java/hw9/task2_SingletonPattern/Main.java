package hw9.task2_SingletonPattern;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Vehicle("BMW", 220, 33980);
        Vehicle car2 = new Vehicle("Audi", 240, 378999);
        Vehicle car3 = new Vehicle("Honda", 180, 22999);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}