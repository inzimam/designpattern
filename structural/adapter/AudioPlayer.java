package structural.adapter;

public class AudioPlayer implements IMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing Mp3 : " + fileName);
    }
}
