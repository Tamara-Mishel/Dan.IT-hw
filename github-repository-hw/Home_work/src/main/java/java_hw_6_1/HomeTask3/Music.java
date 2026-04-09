package java_hw_6_1.HomeTask3;

public class Music extends Media {
    String artist;

    @Override
    public void play() {
        System.out.println("Playing music by " + artist + ": " + title);
    }
}