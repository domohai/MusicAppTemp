package core;

public class Item {
    private String songName = "abc";
    private int id = 0;
    private Audio audio = null;
    
    public Item() {}
    
    public Item(String songName, String path) {
        this.songName = songName;
        audio = new Audio(path);
    }
    
    public void play() {
        if (audio != null) {
            audio.play();
        }
    }
    
    public boolean isPlaying() {
        return audio.isPlaying();
    }
    
    public void stop() {
        audio.stop();
    }
    
    @Override
    public String toString() {
        return songName;
    }
    
    public String getSongName() {
        return songName;
    }
    
    public int getId() {
        return id;
    }
}
