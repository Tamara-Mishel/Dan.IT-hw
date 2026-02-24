package java_hw_6_1.HomeTask3;

public class Video extends Media {
    String resolution;

    @Override
    public void play() {
        System.out.println("Playing video " + title +
                " in resolution " + resolution);
    }
}