package hw9.task3_FactoryPattern;

public class AnimalFactory {

    public Animal createAnimal(String type) {

        if (type.equals("dog")) {
            return new Dog();
        }

        if (type.equals("cat")) {
            return new Cat();
        }

        if (type.equals("bird")) {
            return new Bird();
        }

        return null;
    }
}