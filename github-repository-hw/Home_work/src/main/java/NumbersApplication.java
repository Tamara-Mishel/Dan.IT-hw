import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private final String name;
    private final int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        this.gameNumber = new Random().nextInt(101);
    }

    public void startGame(Scanner scanner) {
        System.out.println("Let the game begin!");

        while (true) {
            System.out.println("Enter a number from 0 to 100:");
            int userNumber = scanner.nextInt();

            if (userNumber < gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (userNumber > gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}