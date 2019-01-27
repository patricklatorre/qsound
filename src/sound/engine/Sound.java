package sound.engine;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.IOException;
import java.io.InputStream;

public class Sound {

    private String soundDirPath;
    private AudioStream audioStream;
    private boolean empty;
    private boolean valid;


    public Sound(String soundDirPath) {
        this.soundDirPath = soundDirPath;
    }

    public void play() {
        InputStream inputStream = getClass().getResourceAsStream(this.soundDirPath);
        if (!empty) {
            try {
                audioStream = new AudioStream(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            AudioPlayer.player.start(audioStream);
        }
    }
}
