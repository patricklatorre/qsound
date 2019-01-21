package sound.engine;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.IOException;
import java.io.InputStream;

public class Sound {

    private String soundDirPath;
    private AudioStream audioStream;

    public Sound(String soundDirPath) {
        this.soundDirPath = soundDirPath;
    }

    public void play() {
        InputStream inputStream = getClass().getResourceAsStream(this.soundDirPath);
        try {
            audioStream = new AudioStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        AudioPlayer.player.start(audioStream);
    }
}
