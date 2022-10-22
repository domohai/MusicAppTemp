package core;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Audio {
    private String path;
    private Media media;
    private MediaPlayer player;
    
    public Audio(String path) {
        media = new Media(new File(path).toURI().toString());
        player = new MediaPlayer(media);
        this.path = path;
    }
    
    public void play() {
        player.play();
    }
    
    public void stop() {
        if (isPlaying()) {
            player.stop();
        }
    }
    
    public boolean isPlaying() {
        return player.getStatus().equals(MediaPlayer.Status.PLAYING);
    }
}
