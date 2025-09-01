package bootcamp.oop.media;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video Player wird abgespielt");
    }
}
