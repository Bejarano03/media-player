public class VideoPlayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Playing movie on Video Player");
        System.out.println("Playing Marvel Infinity War");
    }

    @Override
    public void pause() {
        System.out.println("Pausing video player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video player");
    }
}
