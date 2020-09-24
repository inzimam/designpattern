package structural.adapter;

public class MediaAdapter implements IMediaPlayer {

    IAdvancedMediaPlayer IAdvancedMediaPlayer;
    String type;

    public MediaAdapter(IAdvancedMediaPlayer IAdvancedMediaPlayer, String type) {
        this.IAdvancedMediaPlayer = IAdvancedMediaPlayer;
        this.type = type;
    }

    @Override
    public void play(String fileName) {
        if (type.equals("mp4"))
            IAdvancedMediaPlayer.playMp4(fileName);
        else if (type.equals("vlc")) {
            IAdvancedMediaPlayer.playVlc(fileName);
        } else {
            System.out.println("No valid format");
        }
    }
}
