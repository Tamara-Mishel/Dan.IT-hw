package java_hv_8.List_of_People;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Person> people = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command: addPerson / getPerson / exit");
            String command = scanner.nextLine();
            if (command.equalsIgnoreCase("addPerson")) {
                System.out.println("Enter surname:");
                String surname = scanner.nextLine();

                System.out.println("Enter name:");
                String name = scanner.nextLine();

                int age;
                while (true) {
                    System.out.println("Enter age:");
                    try {
                        age = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Age must be a number. Try again.");
                    }
                }

                String key = surname.toUpperCase();
                Person person = new Person(name, surname, age);
                if (people.containsKey(key)) {
                    System.out.println("Person with this surname exists. Replace? (yes/no)");
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("yes")) {
                        people.put(key, person);
                        System.out.println("Person replaced.");
                    } else {
                        System.out.println("Person not replaced.");
                    }
                } else {
                    people.put(key, person);
                    System.out.println("Person added.");
                }
            }
            else if (command.equalsIgnoreCase("getPerson")) {
                if (people.isEmpty()) {
                    System.out.println("People list is empty.");
                    continue;
                }
                System.out.println("Enter surname:");
                String surname = scanner.nextLine();

                String key = surname.toUpperCase();
                if (people.containsKey(key)) {

                    System.out.println(people.get(key));
                } else {
                    System.out.println("No such surname.");
                    System.out.println("Available surnames:");

                    System.out.println(people.keySet());
                }

            }
            else if (command.equalsIgnoreCase("exit")) {
                System.out.println("Program finished.");
                break;
            }
            else {
                System.out.println("Unknown command. Try again.");

            }
        }
    }
}
