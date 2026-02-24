package java_hw_6_1.HomeTask3;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.title = "Shape of You";
        music.artist = "Ed Sheeran";
        music.play();

        System.out.println();

        Video video = new Video();
        video.title = "Nature Documentary";
        video.resolution = "1920x1080";
        video.play();
    }
}
