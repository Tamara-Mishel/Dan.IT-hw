package java_hw_3;
import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter program (IntelliJ, Git, Java):");
        String program = scanner.next();

        System.out.println("Enter OS (Linux, MacOS, Windows):");
        String os = scanner.next();

        switch (program) {
            case "IntelliJ":
                if (os.equals("Windows")) {
                    System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                } else if (os.equals("MacOS")) {
                    System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                } else if (os.equals("Linux")) {
                    System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                } else {
                    System.out.println("No such OS");
                }
                break;

            case "Git":
                if (os.equals("Windows")) {
                    System.out.println("https://git-scm.com/download/win");
                } else if (os.equals("MacOS")) {
                    System.out.println("https://git-scm.com/download/mac");
                } else if (os.equals("Linux")) {
                    System.out.println("https://git-scm.com/download/linux");
                } else {
                    System.out.println("No such OS");
                }
                break;

            case "Java":
                if (os.equals("Windows")) {
                    System.out.println("https://www.oracle.com/java/technologies/downloads/");
                } else if (os.equals("MacOS")) {
                    System.out.println("https://www.oracle.com/java/technologies/downloads/");
                } else if (os.equals("Linux")) {
                    System.out.println("https://www.oracle.com/java/technologies/downloads/");
                } else {
                    System.out.println("No such OS");
                }
                break;

            default:
                System.out.println("No such program");
        }
    }
}


