package hw9.task2_SingletonPattern;

public class ColorSingleton {

    private static ColorSingleton instance;

    private String color;

    private ColorSingleton() {
        color = "Red";
    }

    public static ColorSingleton getInstance() {

        if (instance == null) {
            instance = new ColorSingleton();
        }

        return instance;
    }

    public String getColor() {
        return color;
    }
}