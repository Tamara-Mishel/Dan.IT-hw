package java_hw_2;

public class HomeTask2 {
    public static void main(String[] args) {
        String text = "Testing is my favourite job";
        System.out.println(text);
        String[] words = text.split(" ");

        System.out.println("word1 = " + words[0] + ", length = " + words[0].length());
        System.out.println("word2 = " + words[1] + ", length = " + words[1].length());
        System.out.println("word3 = " + words[2] + ", length = " + words[2].length());
        System.out.println("word4 = " + words[3] + ", length = " + words[3].length());
        System.out.println("word5 = " + words[4] + ", length = " + words[4].length());



        System.out.println(words[0].length() > words[1].length()
                && words[0].length() > words[2].length()
                && words[0].length() > words[3].length()
                && words[0].length() > words[4].length());
    }
}

