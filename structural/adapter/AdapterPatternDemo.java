package structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        IMediaPlayer IMediaPlayer = new AudioPlayer();
        IMediaPlayer.play("ABC.MP3");
        IMediaPlayer = new MediaAdapter(new Mp4Player(), "mp4");
        IMediaPlayer.play("ABC.MP4");
        IMediaPlayer = new MediaAdapter(new VlcPlayer(), "vlc");
        IMediaPlayer.play("ABC.vlc");
    }
}
