package java_hw_6_2.HomeTask2;

public class Main {

    public static void main(String[] args) {

        String text = "   Hello Java 123!   ";

        TextProcessor upper = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();

        System.out.println("Original: [" + text + "]");

        System.out.println("Upper: " + upper.process(text));
        System.out.println("Reverse: " + reverse.process(text));
        System.out.println("Trim: " + trim.process(text));

        System.out.println("Remove digits:");
        System.out.println(upper.removeDigits(text));
        System.out.println(reverse.removeDigits(text));
        System.out.println(trim.removeDigits(text));
    }
}