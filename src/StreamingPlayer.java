public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("Streaming on Twitch");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Stream");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Stream");
    }
}
