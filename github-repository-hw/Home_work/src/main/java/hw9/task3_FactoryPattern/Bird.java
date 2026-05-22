package hw9.task3_FactoryPattern;

public class Bird implements Animal {

    @Override
    public void speak() {
        System.out.println("Chirp!");
    }
}