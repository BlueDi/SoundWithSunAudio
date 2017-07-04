import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sound {
    private AudioStream as;
    /**
     * File supported by sun.audio.
     */
    private String mFile = "background.wav";

    public Sound() {
        try {
            InputStream in = new FileInputStream(mFile);
            as = new AudioStream(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play() {
        AudioPlayer.player.start(as);
    }
}
