package java_hw_2;

public class H_Task_3 {
    public static void main(String[] args) {
        String sentence = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        sentence = sentence.toLowerCase();
        int count = sentence.split("a").length - 1;
        System.out.println(count);


    }
}
