package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "what.mp3");
        player.play("mp4", "the.mp4");
        player.play("vlc", "fuck.vlc");
        player.play("mp2", "hhh");
    }
}
