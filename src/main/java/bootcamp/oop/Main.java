package bootcamp.oop;

import bootcamp.oop.media.MediaController;
import bootcamp.oop.media.MusicPlayer;
import bootcamp.oop.media.Playable;
import bootcamp.oop.media.VideoPlayer;

import javax.print.attribute.standard.Media;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Playable musicPlayer = new MusicPlayer();
        Playable videoPlayer = new VideoPlayer();
        MediaController mediaController = new MediaController();
        mediaController.playMedia(musicPlayer);
        mediaController.playMedia(videoPlayer);
    }
}