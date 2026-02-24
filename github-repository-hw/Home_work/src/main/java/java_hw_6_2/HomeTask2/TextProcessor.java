package java_hw_6_2.HomeTask2;

public interface TextProcessor {

    String process(String text);

    default String removeDigits(String text) {
        for (char d = '0'; d <= '9'; d++) {
            text = text.replace(String.valueOf(d), "");
        }
        return text;
    }
}
