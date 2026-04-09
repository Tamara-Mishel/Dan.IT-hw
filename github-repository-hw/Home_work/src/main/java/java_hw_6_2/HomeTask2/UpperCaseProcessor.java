package java_hw_6_2.HomeTask2;

public class UpperCaseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
