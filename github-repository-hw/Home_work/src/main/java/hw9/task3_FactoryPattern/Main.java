package hw9.task3_FactoryPattern;

public class Main {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("dog");
        Animal cat = animalFactory.createAnimal("cat");
        Animal bird = animalFactory.createAnimal("bird");

        dog.speak();
        cat.speak();
        bird.speak();
    }
}