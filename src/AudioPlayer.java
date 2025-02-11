public class AudioPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Playing music on Audio Player");
        System.out.println("Playing Kendrick Lamar - HUMBLE");
    }

    @Override
    public void pause() {
        System.out.println("Paused music on Audio Player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on Audio Player");
    }
}
