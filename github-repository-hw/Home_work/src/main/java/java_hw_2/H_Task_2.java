package java_hw_2;

public class H_Task_2 {
    public static void main(String[] args) {
    String string1 = "This line that i want to cut, cause it is too long";
    String string2 = string1.substring(0, 35);
    String string3 = string2.replace("want to cut","dont want to cut") + " it is perfect";

    System.out.println(string1);
    System.out.println(string1.length());
    System.out.println(string2);
    System.out.println(string2.length());
    System.out.println(string3);
    System.out.println(string3.length());


    int from = string1.indexOf("This");
    System.out.println(from);
    int to = string1.indexOf("cause") + "cause".length();
    System.out.println(to);

    System.out.println(string1.substring(0, 35));

        String text = "Testing is my favourite job";
        System.out.println(text);
        String[] words = text.split(" ");

        System.out.println("слово1 = " + words[0] + ", довжина цього слова = " + words[0].length());
        System.out.println("слово2 = " + words[1] + ", довжина цього слова = " + words[1].length());
        System.out.println("слово3 = " + words[2] + ", довжина цього слова = " + words[2].length());
        System.out.println("слово4 = " + words[3] + ", довжина цього слова = " + words[3].length());
        System.out.println("слово5 = " + words[4] + ", довжина цього слова = " + words[4].length());

        boolean check1 = words[0].length() > words[1].length();
        boolean check2 = words[0].length() > words[2].length();
        boolean check3 = words[0].length() > words[3].length();
        boolean check4 = words[0].length() > words[4].length();

        System.out.println(check1 && check2 && check3 && check4);


        System.out.println(words[0].length() > words[1].length()
                && words[0].length() > words[2].length()
                && words[0].length() > words[3].length()
                && words[0].length() > words[4].length());


        String sentence = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        sentence = sentence.toLowerCase();;
        int count = sentence.split("a").length - 1;
        System.out.println(count);


    }
}

